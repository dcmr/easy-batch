/*
 * The MIT License
 *
 *  Copyright (c) 2015, Mahmoud Ben Hassine (mahmoud@benhassine.fr)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package org.easybatch.core.api.event.step;

/**
 * Event interface collection for RecordProcessor events.
 * <p>
 * You should implement this interface in your processor to
 * declare the ability to receive events from the batch process.
 *
 * @author Mario Mueller (mario@xenji.com)
 */
public interface RecordProcessorEventListener {

    /**
     * Called before the record gets processed.
     * @param record The record that will be processed.
     */
    void beforeProcessingRecord(final Object record);

    /**
     * Called after the record has been processed.
     * @param record The processed record.
     * @param processingResult The processing result if any, called from {@link org.easybatch.core.api.ComputationalRecordProcessor#getComputationResult()}
     */
    void afterProcessingRecord(final Object record, final Object processingResult);

    /**
     * Called when an exception occurs during record processing
     * @param record the currently processed record
     * @param throwable the exception occurred during record processing
     */
    void onRecordProcessingException(final Object record, final Throwable throwable);
}
