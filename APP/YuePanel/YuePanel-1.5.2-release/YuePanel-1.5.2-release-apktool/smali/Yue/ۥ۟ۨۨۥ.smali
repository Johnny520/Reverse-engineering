.class public LYue/ۥ۟ۨۨۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۨۨ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۨۨۥ$ۥ;
    }
.end annotation


# instance fields
.field public ۥ:LYue/ۥۣ۟ۨۨ;

.field public ۥ۟:Z

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:LYue/ۥۢۥۣ۠;

.field public ۥ۟۟۟۟:LYue/ۥ۟ۨۨۥ$ۥ;

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:I

.field public ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:LYue/ۥ۠۟ۡۡ;

.field public ۥ۟۟۟ۤ:Z

.field public ۥ۟۟۟ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e8\u06e8\u06e3;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۦ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e8\u06e8\u06e5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۢۥۣ۠;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ:LYue/ۥۣ۟ۨۨ;

    const/4 v1, 0x0

    iput-boolean v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟:Z

    iput-boolean v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟:Z

    sget-object v2, LYue/ۥ۟ۨۨۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۨۨۥ$ۥ;

    iput-object v2, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟:LYue/ۥ۟ۨۨۥ$ۥ;

    const/4 v2, 0x1

    iput v2, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۢ:I

    iput-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥۣ۟۟۟:LYue/ۥ۠۟ۡۡ;

    iput-boolean v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۥ:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    iput-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟:LYue/ۥۢۥۣ۠;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟:LYue/ۥۢۥۣ۠;

    iget-object v1, v1, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    invoke-virtual {v1}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۨ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟:LYue/ۥ۟ۨۨۥ$ۥ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v1, :cond_0

    iget v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "unresolved"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") <t="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":d="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥۣ۟ۨۨ;)V
    .locals 5

    iget-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۨۨۥ;

    iget-boolean v0, v0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-nez v0, :cond_0

    return-void

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟:Z

    iget-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ:LYue/ۥۣ۟ۨۨ;

    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, LYue/ۥۣ۟ۨۨ;->ۥ(LYue/ۥۣ۟ۨۨ;)V

    :cond_2
    iget-boolean v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟:Z

    if-eqz v0, :cond_3

    iget-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟:LYue/ۥۢۥۣ۠;

    invoke-virtual {p1, p0}, LYue/ۥۢۥۣ۠;->ۥ(LYue/ۥۣ۟ۨۨ;)V

    return-void

    :cond_3
    iget-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۟ۨۨۥ;

    instance-of v4, v3, LYue/ۥ۠۟ۡۡ;

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    move-object v1, v3

    goto :goto_0

    :cond_5
    if-eqz v1, :cond_8

    if-ne v2, p1, :cond_8

    iget-boolean p1, v1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥۣ۟۟۟:LYue/ۥ۠۟ۡۡ;

    if-eqz p1, :cond_7

    iget-boolean v0, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v0, :cond_6

    iget v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۢ:I

    iget p1, p1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    mul-int/2addr v0, p1

    iput v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۠:I

    goto :goto_1

    :cond_6
    return-void

    :cond_7
    :goto_1
    iget p1, v1, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    iget v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۠:I

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟(I)V

    :cond_8
    iget-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ:LYue/ۥۣ۟ۨۨ;

    if-eqz p1, :cond_9

    invoke-interface {p1, p0}, LYue/ۥۣ۟ۨۨ;->ۥ(LYue/ۥۣ۟ۨۨ;)V

    :cond_9
    return-void
.end method

.method public ۥ۟(LYue/ۥۣ۟ۨۨ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v0, :cond_0

    invoke-interface {p1, p1}, LYue/ۥۣ۟ۨۨ;->ۥ(LYue/ۥۣ۟ۨۨ;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۦ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    iput v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    iput-boolean v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟:Z

    iput-boolean v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟:Z

    return-void
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟:LYue/ۥۢۥۣ۠;

    iget-object v0, v0, LYue/ۥۢۥۣ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    invoke-virtual {v0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۨ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟:LYue/ۥ۟ۨۨۥ$ۥ;

    sget-object v2, LYue/ۥ۟ۨۨۥ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۨۨۥ$ۥ;

    if-eq v1, v2, :cond_1

    sget-object v2, LYue/ۥ۟ۨۨۥ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۨۨۥ$ۥ;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_VERTICAL"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_HORIZONTAL"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟۟:LYue/ۥ۟ۨۨۥ$ۥ;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(I)V
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۤ:Z

    iput p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۡ:I

    iget-object p1, p0, LYue/ۥ۟ۨۨۥ;->ۥ۟۟۟ۥ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣ۟ۨۨ;

    invoke-interface {v0, v0}, LYue/ۥۣ۟ۨۨ;->ۥ(LYue/ۥۣ۟ۨۨ;)V

    goto :goto_0

    :cond_1
    return-void
.end method
