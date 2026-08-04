.class public abstract Lyyds/ᛸᛲᛵᛲ;
.super Ljava/lang/Object;


# static fields
.field public static final ᛲᲈᲁ:Ljava/util/LinkedHashMap;

.field public static final ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

.field public static final ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛸᛲᛵᛲ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyyds/ᛸᛲᛵᛲ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lyyds/ᛸᛲᛵᛲ;->ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    return-void
.end method

.method public static native ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;
.end method
