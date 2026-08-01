package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
enum TextFormat$Printer$FieldReporterLevel {
    REPORT_ALL(0),
    TEXT_GENERATOR(1),
    PRINT(2),
    PRINTER_PRINT_TO_STRING(3),
    TEXTFORMAT_PRINT_TO_STRING(4),
    PRINT_UNICODE(5),
    SHORT_DEBUG_STRING(6),
    LEGACY_MULTILINE(7),
    LEGACY_SINGLE_LINE(8),
    DEBUG_MULTILINE(9),
    DEBUG_SINGLE_LINE(10),
    ABSTRACT_TO_STRING(11),
    ABSTRACT_BUILDER_TO_STRING(12),
    ABSTRACT_MUTABLE_TO_STRING(13),
    REPORT_NONE(14);

    private final int index;

    TextFormat$Printer$FieldReporterLevel(int i) {
        this.index = i;
    }
}
