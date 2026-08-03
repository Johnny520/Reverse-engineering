package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.util.Fnv;
import java.util.ArrayList;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class JSONPathParser {
    final boolean dollar;
    final JSONReader jsonReader;
    final String path;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONPathParser(String str) {
        this.path = str;
        JSONReader jSONReaderM1669of = JSONReader.m1669of(str, JSONPath.PARSE_CONTEXT);
        this.jsonReader = jSONReaderM1669of;
        char c10 = jSONReaderM1669of.f1929ch;
        if (c10 == '-') {
            C0086a.m464w("not support '-'");
            throw null;
        }
        if (c10 != '$') {
            this.dollar = false;
        } else {
            jSONReaderM1669of.next();
            this.dollar = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private JSONPathSegment parseArrayAccess() {
        JSONPathSegment jSONPathSegmentName;
        this.jsonReader.next();
        JSONReader jSONReader = this.jsonReader;
        char c10 = jSONReader.f1929ch;
        if (c10 == '\"' || c10 == '\'') {
            String string = jSONReader.readString();
            if (this.jsonReader.current() != ']') {
                if (this.jsonReader.isString()) {
                    C0086a.m464w("not support multi name");
                    return null;
                }
                C0086a.m461t(this.jsonReader.current(), "TODO : ");
                return null;
            }
            jSONPathSegmentName = new JSONPathSegmentName(string, Fnv.hashCode64(string));
        } else {
            if (c10 == '*') {
                C0086a.m464w("not support *");
                return null;
            }
            switch (c10) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    int int32Value = jSONReader.readInt32Value();
                    JSONReader jSONReader2 = this.jsonReader;
                    if (jSONReader2.f1929ch == ':') {
                        C0086a.m464w("not support range index ':'");
                        return null;
                    }
                    if (jSONReader2.isNumber()) {
                        C0086a.m464w("not support");
                        return null;
                    }
                    jSONPathSegmentName = JSONPathSegmentIndex.m1658of(int32Value);
                    break;
                    break;
                case ':':
                    C0086a.m464w("not support range index ':'");
                    return null;
                default:
                    C0086a.m461t(this.jsonReader.current(), "TODO : ");
                    return null;
            }
        }
        if (this.jsonReader.nextIfArrayEnd()) {
            return jSONPathSegmentName;
        }
        C0086a.m464w(this.jsonReader.info("jsonpath syntax error"));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private JSONPathSegment parseProperty() {
        JSONReader jSONReader = this.jsonReader;
        char c10 = jSONReader.f1929ch;
        if (c10 == '*') {
            C0086a.m464w("not support *");
            return null;
        }
        if (c10 == '.') {
            C0086a.m464w("not support jsonpath ..");
            return null;
        }
        long fieldNameHashCodeUnquote = jSONReader.readFieldNameHashCodeUnquote();
        String fieldName = this.jsonReader.getFieldName();
        if (this.jsonReader.f1929ch != '(') {
            return new JSONPathSegmentName(fieldName, fieldNameHashCodeUnquote);
        }
        C0086a.m464w("not support jsonpath function");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONPath parse() {
        JSONPathSegment property;
        if (this.dollar && this.jsonReader.f1929ch == 26) {
            return JSONPath.ROOT;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            JSONReader jSONReader = this.jsonReader;
            char c10 = jSONReader.f1929ch;
            if (c10 == 26) {
                return new JSONPath(this.path, arrayList, false, false);
            }
            if (c10 == '.') {
                jSONReader.next();
                property = parseProperty();
            } else if (c10 == '[') {
                property = parseArrayAccess();
            } else if ((c10 >= 'a' && c10 <= 'z') || ((c10 >= 'A' && c10 <= 'Z') || c10 == '_')) {
                property = parseProperty();
            } else {
                if (c10 != '@') {
                    C0086a.m448g(c10, "not support ");
                    return null;
                }
                jSONReader.next();
                property = JSONPathSegment.SelfSegment.INSTANCE;
            }
            arrayList.add(property);
        }
    }
}
