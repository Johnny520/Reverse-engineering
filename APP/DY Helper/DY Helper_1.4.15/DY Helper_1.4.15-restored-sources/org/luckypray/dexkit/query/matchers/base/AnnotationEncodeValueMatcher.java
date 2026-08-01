package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeValueMatcher implements org.luckypray.dexkit.query.base.QueryComponent {
    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion Companion = null;
    private org.luckypray.dexkit.query.enums.AnnotationEncodeValueType type;
    private org.luckypray.dexkit.query.base.IAnnotationEncodeValue value;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString$default(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createString(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher create(java.lang.Number r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.numberValue(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r1 = 0
                r0.<init>(r3, r2, r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createArray(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r1 = 0
                r0.<init>(r3, r2, r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createBoolean(boolean r3) {
                r2 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueBoolean r1 = new org.luckypray.dexkit.query.matchers.EncodeValueBoolean
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createByte(byte r3) {
                r2 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueByte r1 = new org.luckypray.dexkit.query.matchers.EncodeValueByte
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createChar(char r3) {
                r2 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueChar r1 = new org.luckypray.dexkit.query.matchers.EncodeValueChar
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createClass(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r1 = 0
                r0.<init>(r3, r2, r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createDouble(double r3) {
                r2 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueDouble r1 = new org.luckypray.dexkit.query.matchers.EncodeValueDouble
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createEnum(org.luckypray.dexkit.query.matchers.FieldMatcher r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r1 = 0
                r0.<init>(r3, r2, r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createFloat(float r3) {
                r2 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueFloat r1 = new org.luckypray.dexkit.query.matchers.EncodeValueFloat
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createInt(int r3) {
                r2 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueInt r1 = new org.luckypray.dexkit.query.matchers.EncodeValueInt
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createLong(long r3) {
                r2 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueLong r1 = new org.luckypray.dexkit.query.matchers.EncodeValueLong
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r1 = 0
                r0.<init>(r3, r2, r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createNull() {
                r3 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r3 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueNull r1 = new org.luckypray.dexkit.query.matchers.EncodeValueNull
                r1.<init>()
                r2 = 0
                r0.<init>(r1, r3, r2)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createShort(short r3) {
                r2 = this;
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.EncodeValueShort r1 = new org.luckypray.dexkit.query.matchers.EncodeValueShort
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r7) {
                r6 = this;
                r7.getClass()
                r4 = 6
                r5 = 0
                r2 = 0
                r3 = 0
                r0 = r6
                r1 = r7
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r6 = createString$default(r0, r1, r2, r3, r4, r5)
                return r6
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
                r6 = this;
                r7.getClass()
                r8.getClass()
                r4 = 4
                r5 = 0
                r3 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r6 = createString$default(r0, r1, r2, r3, r4, r5)
                return r6
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r3, org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
                r1.<init>(r3, r4, r5)
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(org.luckypray.dexkit.query.matchers.base.StringMatcher r3) {
                r2 = this;
                r3.getClass()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
                org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher
                r1 = 0
                r0.<init>(r3, r2, r1)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion = r0
            return
    }

    public AnnotationEncodeValueMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private AnnotationEncodeValueMatcher(org.luckypray.dexkit.query.base.IAnnotationEncodeValue r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.type = r2
            return
    }

    public /* synthetic */ AnnotationEncodeValueMatcher(org.luckypray.dexkit.query.base.IAnnotationEncodeValue r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2, p000.AbstractC1067zq r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher create(java.lang.Number r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.create(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createAnnotation(org.luckypray.dexkit.query.matchers.AnnotationMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createAnnotation(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createArray(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createArray(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createBoolean(boolean r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createBoolean(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createByte(byte r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createByte(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createChar(char r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createChar(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createClass(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createClass(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createDouble(double r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createDouble(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createEnum(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createEnum(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createFloat(float r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createFloat(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createInt(int r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createInt(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createLong(long r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createLong(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createMethod(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createMethod(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createNull() {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.createNull()
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createShort(short r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createShort(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createString(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createString(r1, r2)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createString(r1, r2, r3)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher createString(org.luckypray.dexkit.query.matchers.base.StringMatcher r1) {
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r1 = r0.createString(r1)
            return r1
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue$default(org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r0 = r0.stringValue(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher annotationValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotationValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher annotationValue(org.luckypray.dexkit.query.matchers.AnnotationMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.value = r1
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue
            r0.type = r1
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher arrayValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.arrayValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher arrayValue(org.luckypray.dexkit.query.matchers.AnnotationEncodeArrayMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.value = r1
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue
            r0.type = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher boolValue(boolean r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueBoolean r0 = new org.luckypray.dexkit.query.matchers.EncodeValueBoolean
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher byteValue(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueByte r0 = new org.luckypray.dexkit.query.matchers.EncodeValueByte
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher charValue(char r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueChar r0 = new org.luckypray.dexkit.query.matchers.EncodeValueChar
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue
            r1.type = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher classValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.classValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher classValue(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.value = r1
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue
            r0.type = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher doubleValue(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueDouble r0 = new org.luckypray.dexkit.query.matchers.EncodeValueDouble
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue
            r1.type = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher enumValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.enumValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher enumValue(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.value = r1
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue
            r0.type = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher floatValue(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueFloat r0 = new org.luckypray.dexkit.query.matchers.EncodeValueFloat
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.enums.AnnotationEncodeValueType getType() {
            r0 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r0.type
            return r0
    }

    public final org.luckypray.dexkit.query.base.IAnnotationEncodeValue getValue() {
            r0 = this;
            org.luckypray.dexkit.query.base.IAnnotationEncodeValue r0 = r0.value
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher intValue(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueInt r0 = new org.luckypray.dexkit.query.matchers.EncodeValueInt
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher longValue(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueLong r0 = new org.luckypray.dexkit.query.matchers.EncodeValueLong
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue
            r1.type = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher methodValue(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.methodValue(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher methodValue(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.value = r1
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue
            r0.type = r1
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher nullValue() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueNull r0 = new org.luckypray.dexkit.query.matchers.EncodeValueNull
            r0.<init>()
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue
            r1.type = r0
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher numberValue(java.lang.Number r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            byte r3 = r3.byteValue()
            r2.byteValue(r3)
            return r2
        Lf:
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 == 0) goto L1b
            short r3 = r3.shortValue()
            r2.shortValue(r3)
            return r2
        L1b:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L27
            int r3 = r3.intValue()
            r2.intValue(r3)
            return r2
        L27:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L33
            long r0 = r3.longValue()
            r2.longValue(r0)
            return r2
        L33:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L3f
            float r3 = r3.floatValue()
            r2.floatValue(r3)
            return r2
        L3f:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L4a
            double r0 = r3.doubleValue()
            r2.doubleValue(r0)
        L4a:
            return r2
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher shortValue(short r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueShort r0 = new org.luckypray.dexkit.query.matchers.EncodeValueShort
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r6 = stringValue$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher r6 = stringValue$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.value = r0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.AnnotationEncodeValueMatcher stringValue(org.luckypray.dexkit.query.matchers.base.StringMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.value = r1
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
            r0.type = r1
            return r0
    }
}
