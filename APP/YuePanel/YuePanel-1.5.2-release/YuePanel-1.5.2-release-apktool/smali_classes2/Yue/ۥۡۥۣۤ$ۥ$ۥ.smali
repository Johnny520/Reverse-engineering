.class public final LYue/ۥۡۥۣۤ$ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۥۣۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۥۣۤ$ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(ILjava/util/List;)Z
    .locals 0
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e1;",
            ">;)Z"
        }
    .end annotation

    const-string p1, "requestHeaders"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟(ILYue/ۥۣۣ۟۠;IZ)Z
    .locals 0
    .param p2    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string p1, "source"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long p3, p3

    invoke-interface {p2, p3, p4}, LYue/ۥۣۣ۟۠;->skip(J)V

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟(ILjava/util/List;Z)Z
    .locals 0
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e1;",
            ">;Z)Z"
        }
    .end annotation

    const-string p1, "responseHeaders"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟۟(ILYue/ۥ۠ۡ۠ۢ;)V
    .locals 0
    .param p2    # LYue/ۥ۠ۡ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string p1, "errorCode"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
