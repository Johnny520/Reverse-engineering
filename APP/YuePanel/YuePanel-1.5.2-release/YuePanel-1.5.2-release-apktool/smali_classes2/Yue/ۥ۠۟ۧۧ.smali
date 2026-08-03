.class public LYue/ۥ۠۟ۧۧ;
.super LYue/ۥ۠ۧ۟ۥ;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟۠ۨ:Ljava/lang/String; = "PUBLIC"

.field public static final ۥ۟۟ۡ:Ljava/lang/String; = "SYSTEM"

.field public static final ۥ۟۟ۡ۟:Ljava/lang/String; = "name"

.field public static final ۥ۟۟ۡ۠:Ljava/lang/String; = "pubSysKey"

.field public static final ۥ۟۟ۡۡ:Ljava/lang/String; = "publicId"

.field public static final ۥ۟۟ۡۢ:Ljava/lang/String; = "systemId"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, LYue/ۥ۠ۧ۟ۥ;-><init>()V

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p3}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    const-string v0, "name"

    invoke-virtual {p0, v0, p1}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    const-string p1, "publicId"

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    const-string p1, "systemId"

    invoke-virtual {p0, p1, p3}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦۥ()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۢۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "#doctype"

    return-object v0
.end method

.method public ۥۣۣ۟۟(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget p2, p0, LYue/ۥۣۡۢۤ;->ۥ۟۟۠ۤ:I

    if-lez p2, :cond_0

    invoke-virtual {p3}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥۣ۟۟۠()Z

    move-result p2

    if-eqz p2, :cond_0

    const/16 p2, 0xa

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    invoke-virtual {p3}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۤ()LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    move-result-object p2

    sget-object p3, LYue/ۥ۠۟ۧۥ$ۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    const-string v0, "systemId"

    const-string v1, "publicId"

    if-ne p2, p3, :cond_1

    invoke-virtual {p0, v1}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦ۠(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, v0}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦ۠(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "<!doctype"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_1
    const-string p2, "<!DOCTYPE"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_0
    const-string p2, "name"

    invoke-virtual {p0, p2}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦ۠(Ljava/lang/String;)Z

    move-result p3

    const-string v2, " "

    if-eqz p3, :cond_2

    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p3

    invoke-virtual {p0, p2}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_2
    const-string p2, "pubSysKey"

    invoke-virtual {p0, p2}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦ۠(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p3

    invoke-virtual {p0, p2}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_3
    invoke-virtual {p0, v1}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦ۠(Ljava/lang/String;)Z

    move-result p2

    const/16 p3, 0x22

    const-string v2, " \""

    if-eqz p2, :cond_4

    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-virtual {p0, v1}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_4
    invoke-virtual {p0, v0}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦ۠(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-virtual {p0, v0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_5
    const/16 p2, 0x3e

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public ۥۣ۟۟ۤ(Ljava/lang/Appendable;ILYue/ۥ۠۟ۧۥ$ۥ;)V
    .locals 0

    return-void
.end method

.method public final ۥ۟۟ۦ۠(Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public ۥ۟۟ۦۡ()Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-virtual {p0, v0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۦۢ()Ljava/lang/String;
    .locals 1

    const-string v0, "publicId"

    invoke-virtual {p0, v0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۦۣ(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "pubSysKey"

    invoke-virtual {p0, v0, p1}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۦۤ()Ljava/lang/String;
    .locals 1

    const-string v0, "systemId"

    invoke-virtual {p0, v0}, LYue/ۥ۠ۧ۟ۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۦۥ()V
    .locals 2

    const-string v0, "publicId"

    invoke-virtual {p0, v0}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦ۠(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "pubSysKey"

    if-eqz v0, :cond_0

    const-string v0, "PUBLIC"

    invoke-virtual {p0, v1, v0}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    goto :goto_0

    :cond_0
    const-string v0, "systemId"

    invoke-virtual {p0, v0}, LYue/ۥ۠۟ۧۧ;->ۥ۟۟ۦ۠(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "SYSTEM"

    invoke-virtual {p0, v1, v0}, LYue/ۥ۠ۧ۟ۥ;->ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ;

    :cond_1
    :goto_0
    return-void
.end method
