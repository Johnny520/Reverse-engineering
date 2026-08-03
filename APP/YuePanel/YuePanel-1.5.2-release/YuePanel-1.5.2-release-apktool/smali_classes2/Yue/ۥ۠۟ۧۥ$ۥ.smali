.class public LYue/ۥ۠۟ۧۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۟ۧۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۟ۧۥ$ۥ$ۥ;
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

.field public ۥ۟۟۠ۤ:Ljava/nio/charset/Charset;

.field public ۥ۟۟۠ۥ:LYue/ۥ۠ۡ۟۟$ۥ۟;

.field public final ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/nio/charset/CharsetEncoder;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۧ:Z

.field public ۥ۟۟۠ۨ:Z

.field public ۥ۟۟ۡ:I

.field public ۥ۟۟ۡ۟:I

.field public ۥ۟۟ۡ۠:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    iput-object v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۧ:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۨ:Z

    iput v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟ۡ:I

    const/16 v0, 0x1e

    iput v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟ۡ۟:I

    sget-object v0, LYue/ۥ۠۟ۧۥ$ۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    iput-object v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟ۡ۠:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    sget-object v0, LYue/ۥ۟ۨۢۦ;->ۥ۟:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟(Ljava/nio/charset/Charset;)LYue/ۥ۠۟ۧۥ$ۥ;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟۠()LYue/ۥ۠۟ۧۥ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/String;)LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 0

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟(Ljava/nio/charset/Charset;)LYue/ۥ۠۟ۧۥ$ۥ;

    return-object p0
.end method

.method public ۥ۟۟۟(Ljava/nio/charset/Charset;)LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 0

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/nio/charset/Charset;

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۡ۟۟$ۥ۟;->ۥ۟۟۟(Ljava/lang/String;)LYue/ۥ۠ۡ۟۟$ۥ۟;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۡ۟۟$ۥ۟;

    return-object p0
.end method

.method public ۥ۟۟۟۟()Ljava/nio/charset/Charset;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public ۥ۟۟۟۠()LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 2

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠۟ۧۥ$ۥ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟(Ljava/lang/String;)LYue/ۥ۠۟ۧۥ$ۥ;

    iget-object v1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->valueOf(Ljava/lang/String;)LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    move-result-object v1

    iput-object v1, v0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public ۥ۟۟۟ۡ()Ljava/nio/charset/CharsetEncoder;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/charset/CharsetEncoder;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠۠()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۠ۡ۟۟$ۥ۟۟;)LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 0

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    return-object p0
.end method

.method public ۥۣ۟۟۟()LYue/ۥ۠ۡ۟۟$ۥ۟۟;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    return-object v0
.end method

.method public ۥ۟۟۟ۤ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟ۡ:I

    return v0
.end method

.method public ۥ۟۟۟ۥ(I)LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۢ(Z)V

    iput p1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟ۡ:I

    return-object p0
.end method

.method public ۥ۟۟۟ۦ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟ۡ۟:I

    return v0
.end method

.method public ۥ۟۟۟ۧ(I)LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 1

    const/4 v0, -0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۢ(Z)V

    iput p1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟ۡ۟:I

    return-object p0
.end method

.method public ۥ۟۟۟ۨ(Z)LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۨ:Z

    return-object p0
.end method

.method public ۥ۟۟۠۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۨ:Z

    return v0
.end method

.method public ۥ۟۟۠۠()Ljava/nio/charset/CharsetEncoder;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v0
.end method

.method public ۥ۟۟۠ۢ(Z)LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۧ:Z

    return-object p0
.end method

.method public ۥۣ۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۧ:Z

    return v0
.end method

.method public ۥ۟۟۠ۤ()LYue/ۥ۠۟ۧۥ$ۥ$ۥ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟ۡ۠:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    return-object v0
.end method

.method public ۥ۟۟۠ۥ(LYue/ۥ۠۟ۧۥ$ۥ$ۥ;)LYue/ۥ۠۟ۧۥ$ۥ;
    .locals 1

    iput-object p1, p0, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟ۡ۠:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    sget-object v0, LYue/ۥ۠۟ۧۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    if-ne p1, v0, :cond_0

    sget-object p1, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    invoke-virtual {p0, p1}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۡ۟۟$ۥ۟۟;)LYue/ۥ۠۟ۧۥ$ۥ;

    :cond_0
    return-object p0
.end method
