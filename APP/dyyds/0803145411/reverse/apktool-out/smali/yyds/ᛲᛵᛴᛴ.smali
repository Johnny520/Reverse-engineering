.class public abstract Lyyds/ᛲᛵᛴᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Ljava/nio/charset/Charset;

.field public static final ᛲᲈᲁ:Ljava/nio/charset/Charset;

.field public static final ᛵᛸᛸᛷ:Ljava/nio/charset/Charset;

.field public static volatile ᛶᛷᛲᲁ:Ljava/nio/charset/Charset;

.field public static final ᲀᛲᛳᲀ:Ljava/nio/charset/Charset;

.field public static volatile ᲇᲇᲇᛱ:Ljava/nio/charset/Charset;

.field public static final ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    const-string v0, "UTF-16"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 12
    .line 13
    .line 14
    const-string v0, "UTF-16BE"

    .line 15
    .line 16
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lyyds/ᛲᛵᛴᛴ;->ᛵᛸᛸᛷ:Ljava/nio/charset/Charset;

    .line 21
    .line 22
    const-string v0, "UTF-16LE"

    .line 23
    .line 24
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lyyds/ᛲᛵᛴᛴ;->ᲀᛲᛳᲀ:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    const-string v0, "US-ASCII"

    .line 31
    .line 32
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lyyds/ᛲᛵᛴᛴ;->ᲇᲈᛵᛷ:Ljava/nio/charset/Charset;

    .line 37
    .line 38
    const-string v0, "ISO-8859-1"

    .line 39
    .line 40
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, Lyyds/ᛲᛵᛴᛴ;->ᛲᛴᛳᛲ:Ljava/nio/charset/Charset;

    .line 45
    .line 46
    return-void
.end method
