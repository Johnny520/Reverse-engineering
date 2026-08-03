.class public final L۟/y8$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/y8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final ۥ:L۟/z7$e;

.field public final ۥ۟:Landroid/graphics/Bitmap;

.field public final ۥ۟۟:Ljava/io/InputStream;

.field public final ۥ۟۠:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    sget-object v0, L۟/z7$e;->ۥ۟۟:L۟/z7$e;

    .line 2
    sget-object v1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v0, v2}, L۟/y8$a;-><init>(Landroid/graphics/Bitmap;Ljava/io/InputStream;L۟/z7$e;I)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "bitmap == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Ljava/io/InputStream;L۟/z7$e;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    xor-int/2addr v0, v2

    if-eqz v0, :cond_2

    iput-object p1, p0, L۟/y8$a;->ۥ۟:Landroid/graphics/Bitmap;

    iput-object p2, p0, L۟/y8$a;->ۥ۟۟:Ljava/io/InputStream;

    sget-object p1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    iput-object p3, p0, L۟/y8$a;->ۥ:L۟/z7$e;

    iput p4, p0, L۟/y8$a;->ۥ۟۠:I

    return-void

    .line 4
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public constructor <init>(Ljava/io/InputStream;L۟/z7$e;)V
    .locals 2

    sget-object v0, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v1, p1, p2, v0}, L۟/y8$a;-><init>(Landroid/graphics/Bitmap;Ljava/io/InputStream;L۟/z7$e;I)V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "stream == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
