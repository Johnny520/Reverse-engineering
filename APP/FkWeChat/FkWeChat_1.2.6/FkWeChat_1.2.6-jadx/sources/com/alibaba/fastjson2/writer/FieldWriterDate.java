package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterDate<T> extends FieldWriter<T> {
    protected ObjectWriter dateWriter;
    final boolean formatISO8601;
    final boolean formatMillis;
    final boolean formatUnixTime;
    protected DateTimeFormatter formatter;
    final boolean formatyyyyMMdd8;
    final boolean formatyyyyMMddhhmmss14;
    final boolean formatyyyyMMddhhmmss19;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FieldWriterDate(java.lang.String r1, int r2, long r3, java.lang.String r5, java.util.Locale r6, java.lang.String r7, java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Field r10, java.lang.reflect.Method r11, java.lang.Object r12) {
        /*
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r0
            r2 = 0
            if (r5 == 0) goto L77
            int r3 = r5.hashCode()
            r4 = 1
            r6 = -1
            switch(r3) {
                case -1074095546: goto L48;
                case -288020395: goto L3d;
                case -276306848: goto L32;
                case 1333195168: goto L27;
                case 1349114208: goto L1c;
                case 2095190916: goto L11;
                default: goto L10;
            }
        L10:
            goto L52
        L11:
            java.lang.String r3 = "iso8601"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L1a
            goto L52
        L1a:
            r6 = 5
            goto L52
        L1c:
            java.lang.String r3 = "yyyyMMddHHmmss"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L25
            goto L52
        L25:
            r6 = 4
            goto L52
        L27:
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L30
            goto L52
        L30:
            r6 = 3
            goto L52
        L32:
            java.lang.String r3 = "yyyyMMdd"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L3b
            goto L52
        L3b:
            r6 = 2
            goto L52
        L3d:
            java.lang.String r3 = "unixtime"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L46
            goto L52
        L46:
            r6 = r4
            goto L52
        L48:
            java.lang.String r3 = "millis"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L51
            goto L52
        L51:
            r6 = r2
        L52:
            switch(r6) {
                case 0: goto L71;
                case 1: goto L6c;
                case 2: goto L67;
                case 3: goto L61;
                case 4: goto L5b;
                case 5: goto L56;
                default: goto L55;
            }
        L55:
            goto L77
        L56:
            r3 = r2
            r5 = r3
        L58:
            r6 = r5
            r7 = r6
            goto L7b
        L5b:
            r3 = r2
            r5 = r3
            r7 = r5
            r6 = r4
        L5f:
            r4 = r7
            goto L7b
        L61:
            r3 = r2
            r5 = r3
            r6 = r5
            r7 = r4
            r4 = r6
            goto L7b
        L67:
            r3 = r2
            r6 = r3
            r7 = r6
            r5 = r4
            goto L5f
        L6c:
            r5 = r2
            r6 = r5
            r7 = r6
            r3 = r4
            goto L5f
        L71:
            r3 = r2
            r5 = r3
            r6 = r5
            r7 = r6
            r2 = r4
            goto L5f
        L77:
            r3 = r2
            r4 = r3
            r5 = r4
            goto L58
        L7b:
            r1.formatMillis = r2
            r1.formatISO8601 = r4
            r1.formatUnixTime = r3
            r1.formatyyyyMMdd8 = r5
            r1.formatyyyyMMddhhmmss14 = r6
            r1.formatyyyyMMddhhmmss19 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.FieldWriterDate.<init>(java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Field, java.lang.reflect.Method, java.lang.Object):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t10) {
        return this.propertyAccessor.getObject(t10);
    }

    public DateTimeFormatter getFormatter() {
        String str;
        if (this.formatter == null && (str = this.format) != null && !this.formatMillis && !this.formatISO8601 && !this.formatUnixTime) {
            this.formatter = DateTimeFormatter.ofPattern(str);
        }
        return this.formatter;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        if (cls != this.fieldClass) {
            return jSONWriter.getObjectWriter(cls);
        }
        ObjectWriterProvider objectWriterProvider = jSONWriter.context.provider;
        if (this.dateWriter == null) {
            if ((objectWriterProvider.userDefineMask & 16) == 0) {
                if (this.format == null) {
                    ObjectWriterImplDate objectWriterImplDate = ObjectWriterImplDate.INSTANCE;
                    this.dateWriter = objectWriterImplDate;
                    return objectWriterImplDate;
                }
                ObjectWriterImplDate objectWriterImplDate2 = new ObjectWriterImplDate(this.format, null);
                this.dateWriter = objectWriterImplDate2;
                return objectWriterImplDate2;
            }
            this.dateWriter = objectWriterProvider.getObjectWriter((Type) cls, cls, false);
        }
        return this.dateWriter;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean isDateFormatISO8601() {
        return this.formatISO8601;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean isDateFormatMillis() {
        return this.formatMillis;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t10) {
        Date date = (Date) this.propertyAccessor.getObject(t10);
        if (date != null) {
            writeDate(jSONWriter, date.getTime());
            return true;
        }
        if (((this.features | jSONWriter.getFeatures()) & 16) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeNull();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeDate(com.alibaba.fastjson2.JSONWriter r35, long r36) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.FieldWriterDate.writeDate(com.alibaba.fastjson2.JSONWriter, long):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t10) {
        Date date = (Date) this.propertyAccessor.getObject(t10);
        if (date == null) {
            jSONWriter.writeNull();
        } else {
            writeDate(jSONWriter, false, date.getTime());
        }
    }
}
