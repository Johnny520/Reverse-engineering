.class public LYue/ۥ۠۠ۥۥ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢۤ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۠ۥۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۠ۥۥ$ۥ۟;->ۥ:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣۡۢۤ;I)V
    .locals 0

    instance-of p2, p1, LYue/ۥۢۡ۠ۦ;

    if-eqz p2, :cond_0

    check-cast p1, LYue/ۥۢۡ۠ۦ;

    iget-object p2, p0, LYue/ۥ۠۠ۥۥ$ۥ۟;->ۥ:Ljava/lang/StringBuilder;

    invoke-static {p2, p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦ۟(Ljava/lang/StringBuilder;LYue/ۥۢۡ۠ۦ;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, LYue/ۥ۠۠ۥۥ;

    if-eqz p2, :cond_2

    check-cast p1, LYue/ۥ۠۠ۥۥ;

    iget-object p2, p0, LYue/ۥ۠۠ۥۥ$ۥ۟;->ۥ:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    if-lez p2, :cond_2

    invoke-virtual {p1}, LYue/ۥ۠۠ۥۥ;->ۥۣ۟۠ۢ()Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "br"

    invoke-virtual {p1, p2}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۥ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, LYue/ۥ۠۠ۥۥ$ۥ۟;->ۥ:Ljava/lang/StringBuilder;

    invoke-static {p1}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۤ(Ljava/lang/StringBuilder;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LYue/ۥ۠۠ۥۥ$ۥ۟;->ۥ:Ljava/lang/StringBuilder;

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_0
    return-void
.end method

.method public ۥ۟(LYue/ۥۣۡۢۤ;I)V
    .locals 0

    instance-of p2, p1, LYue/ۥ۠۠ۥۥ;

    if-eqz p2, :cond_1

    move-object p2, p1

    check-cast p2, LYue/ۥ۠۠ۥۥ;

    invoke-virtual {p1}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۦ()LYue/ۥۣۡۢۤ;

    move-result-object p1

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥۣ۟۠ۢ()Z

    move-result p2

    if-eqz p2, :cond_1

    instance-of p2, p1, LYue/ۥۢۡ۠ۦ;

    if-nez p2, :cond_0

    instance-of p2, p1, LYue/ۥ۠۠ۥۥ;

    if-eqz p2, :cond_1

    check-cast p1, LYue/ۥ۠۠ۥۥ;

    invoke-static {p1}, LYue/ۥ۠۠ۥۥ;->ۥ۟۟ۦ۠(LYue/ۥ۠۠ۥۥ;)LYue/ۥۢ۠ۨۡ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۢ۠ۨۡ;->ۥ۟۟۟ۦ()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, LYue/ۥ۠۠ۥۥ$ۥ۟;->ۥ:Ljava/lang/StringBuilder;

    invoke-static {p1}, LYue/ۥۢۡ۠ۦ;->ۥ۟۟ۦۤ(Ljava/lang/StringBuilder;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, LYue/ۥ۠۠ۥۥ$ۥ۟;->ۥ:Ljava/lang/StringBuilder;

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method
