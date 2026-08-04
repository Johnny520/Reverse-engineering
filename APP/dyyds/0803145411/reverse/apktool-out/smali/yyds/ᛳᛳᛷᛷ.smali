.class public final Lyyds/ᛳᛳᛷᛷ;
.super Lyyds/ᲀᲈᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.bitmap.FitCenter"

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛶᲀᛶᲀ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lyyds/ᛳᛳᛷᛷ;->ᛵᛸᛸᛷ:[B

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lyyds/ᛳᛳᛷᛷ;

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const p0, 0x5db7ce1d

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛳᛳᛷᛷ;->ᛵᛸᛸᛷ:[B

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᲈᛱᛸᛴ;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4}, Lyyds/ᲈᛵᛷᛲ;->ᛵᛸᛸᛷ(Lyyds/ᲈᛱᛸᛴ;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
