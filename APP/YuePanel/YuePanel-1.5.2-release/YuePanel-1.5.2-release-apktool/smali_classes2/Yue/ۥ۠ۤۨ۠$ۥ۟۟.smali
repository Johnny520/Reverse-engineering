.class public LYue/ۥ۠ۤۨ۠$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۦۧۤ$ۥ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۨ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:Ljava/io/InputStream;

.field public ۥ۟۟۟:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    return-void
.end method

.method public static ۥ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;
    .locals 1

    new-instance v0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;
    .locals 1

    new-instance v0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟۟ۢ(Ljava/io/InputStream;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public key()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic value(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟۟ۥ(Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    move-result-object p1

    return-object p1
.end method

.method public value()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟(Ljava/io/InputStream;)LYue/ۥ۟ۦۧۤ$ۥ۟;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟۟ۢ(Ljava/io/InputStream;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟;
    .locals 0

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟۟:Ljava/lang/String;

    return-object p0
.end method

.method public bridge synthetic ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟۟ۤ(Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۢ(Ljava/io/InputStream;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    const-string v1, "inputStream"

    invoke-static {v0, v1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟:Ljava/io/InputStream;

    return-object p0
.end method

.method public ۥۣ۟۟۟()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟:Ljava/io/InputStream;

    return-object v0
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟۟ۥ(Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    return-object p0
.end method
