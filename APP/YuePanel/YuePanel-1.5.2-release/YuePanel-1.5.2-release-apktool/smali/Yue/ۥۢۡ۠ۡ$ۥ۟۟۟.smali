.class public abstract LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡ۠۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡ۠ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۢۡ۠ۡ$ۥ۟۟;


# direct methods
.method public constructor <init>(LYue/ۥۢۡ۠ۡ$ۥ۟۟;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;->ۥ:LYue/ۥۢۡ۠ۡ$ۥ۟۟;

    return-void
.end method


# virtual methods
.method public ۥ([CII)Z
    .locals 0

    invoke-static {p1}, Ljava/nio/CharBuffer;->wrap([C)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;->ۥ۟(Ljava/lang/CharSequence;II)Z

    move-result p1

    return p1
.end method

.method public ۥ۟(Ljava/lang/CharSequence;II)Z
    .locals 1

    if-eqz p1, :cond_1

    if-ltz p2, :cond_1

    if-ltz p3, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p3

    if-lt v0, p2, :cond_1

    iget-object v0, p0, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;->ۥ:LYue/ۥۢۡ۠ۡ$ۥ۟۟;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;->ۥ۟۟()Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;->ۥ۟۟۟(Ljava/lang/CharSequence;II)Z

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public abstract ۥ۟۟()Z
.end method

.method public final ۥ۟۟۟(Ljava/lang/CharSequence;II)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;->ۥ:LYue/ۥۢۡ۠ۡ$ۥ۟۟;

    invoke-interface {v0, p1, p2, p3}, LYue/ۥۢۡ۠ۡ$ۥ۟۟;->ۥ(Ljava/lang/CharSequence;II)I

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    if-eq p1, p2, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۡ۠ۡ$ۥ۟۟۟;->ۥ۟۟()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    return p2
.end method
