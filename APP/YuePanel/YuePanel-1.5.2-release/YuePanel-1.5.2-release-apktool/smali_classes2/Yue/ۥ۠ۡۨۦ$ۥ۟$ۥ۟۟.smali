.class public final LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;
.super LYue/ۥ۠ۡۨۦ$ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۨۦ$ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ۟:Z

.field public ۥ۟۟:[Ljava/io/File;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟:I

.field public final synthetic ۥ۟۟۟۟:LYue/ۥ۠ۡۨۦ$ۥ۟;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۨۦ$ۥ۟;Ljava/io/File;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۡۨۦ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    const-string v0, "rootDir"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۦ$ۥ۟;

    invoke-direct {p0, p2}, LYue/ۥ۠ۡۨۦ$ۥ;-><init>(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public ۥ۟()Ljava/io/File;
    .locals 10
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-boolean v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۦ$ۥ۟;

    iget-object v0, v0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۨۦ;

    invoke-static {v0}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟۟۟(LYue/ۥ۠ۡۨۦ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ()Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟:Z

    invoke-virtual {p0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ()Ljava/io/File;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟:[Ljava/io/File;

    if-eqz v0, :cond_4

    iget v2, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟۟:I

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    array-length v0, v0

    if-ge v2, v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۦ$ۥ۟;

    iget-object v0, v0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۨۦ;

    invoke-static {v0}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟۟ۡ(LYue/ۥ۠ۡۨۦ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ()Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v1

    :cond_4
    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟:[Ljava/io/File;

    if-nez v0, :cond_8

    invoke-virtual {p0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟:[Ljava/io/File;

    if-nez v0, :cond_5

    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۦ$ۥ۟;

    iget-object v0, v0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۨۦ;

    invoke-static {v0}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟۟۠(LYue/ۥ۠ۡۨۦ;)LYue/ۥۣ۠ۢۢ;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ()Ljava/io/File;

    move-result-object v2

    new-instance v9, LYue/ۥۣ۟۟۠;

    invoke-virtual {p0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ()Ljava/io/File;

    move-result-object v4

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    const-string v6, "Cannot list files in a directory"

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, LYue/ۥۣ۟۟۠;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    invoke-interface {v0, v2, v9}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟:[Ljava/io/File;

    if-eqz v0, :cond_6

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    array-length v0, v0

    if-nez v0, :cond_8

    :cond_6
    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟۟۟:LYue/ۥ۠ۡۨۦ$ۥ۟;

    iget-object v0, v0, LYue/ۥ۠ۡۨۦ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡۨۦ;

    invoke-static {v0}, LYue/ۥ۠ۡۨۦ;->ۥ۟۟۟ۡ(LYue/ۥ۠ۡۨۦ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ()Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    return-object v1

    :cond_8
    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟:[Ljava/io/File;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v1, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟۟:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LYue/ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟;->ۥ۟۟۟:I

    aget-object v0, v0, v1

    return-object v0
.end method
