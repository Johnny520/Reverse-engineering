.class public abstract Lyyds/ᛲᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᲇᲁᲀᲁ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v2, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lyyds/ᲇᲁᲀᲁ;-><init>([B)V

    .line 12
    .line 13
    .line 14
    iput-object v2, v0, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, v0, Lyyds/ᲇᲁᲀᲁ;->ᲀᛲᛳᲀ:[B

    .line 17
    .line 18
    sput-object v0, Lyyds/ᛲᲈᲁ;->ᛲᲈᲁ:[B

    .line 19
    .line 20
    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    .line 21
    .line 22
    sget-object v1, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 25
    .line 26
    .line 27
    return-void
.end method
