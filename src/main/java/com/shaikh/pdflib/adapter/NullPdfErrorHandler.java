package com.shaikh.pdflib.adapter;

class NullPdfErrorHandler implements PdfErrorHandler {
    @Override
    public void onPdfError(Throwable t) {
        /* Empty */
    }
}