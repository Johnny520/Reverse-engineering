.class public abstract LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;
.super LYue/ۥۢۡۧ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۧ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# static fields
.field public static final ۥ۟۟ۢۢ:I = 0x200

.field public static final synthetic ۥۣ۟۟ۢ:Z


# instance fields
.field public ۥ۟۟۠ۧ:Ljava/lang/String;

.field public ۥ۟۟۠ۨ:Ljava/lang/String;

.field public ۥ۟۟ۡ:Z

.field public ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

.field public ۥ۟۟ۡ۠:Ljava/lang/String;

.field public final ۥ۟۟ۡۡ:Ljava/lang/StringBuilder;

.field public ۥ۟۟ۡۢ:Z

.field public ۥۣ۟۟ۡ:Ljava/lang/String;

.field public final ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

.field public ۥ۟۟ۡۥ:Z

.field public ۥ۟۟ۡۦ:Z

.field public final ۥ۟۟ۡۧ:LYue/ۥۢۢۡۧ;

.field public final ۥ۟۟ۡۨ:Z

.field public ۥ۟۟ۢ:I

.field public ۥ۟۟ۢ۟:I

.field public ۥ۟۟ۢ۠:I

.field public ۥ۟۟ۢۡ:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;LYue/ۥۢۢۡۧ;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LYue/ۥۢۡۧ۠;-><init>(LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;LYue/ۥۢۡۧ۠$ۥ;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ:Ljava/lang/StringBuilder;

    iput-boolean p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۢ:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

    iput-boolean p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۥ:Z

    iput-boolean p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۦ:Z

    iput-object p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۧ:LYue/ۥۢۢۡۧ;

    iget-boolean p1, p2, LYue/ۥۢۢۡۧ;->ۥ۟۟۟ۦ:Z

    iput-boolean p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۨ:Z

    return-void
.end method


# virtual methods
.method public abstract toString()Ljava/lang/String;
.end method

.method public bridge synthetic ۥ۟۟۠ۢ()LYue/ۥۢۡۧ۠;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۦ()LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۡ۟(CII)V
    .locals 0

    invoke-virtual {p0, p2, p3}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۦ(II)V

    iget-object p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۥ۟۟ۡ۠(Ljava/lang/String;II)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0xfffd

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p3}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۦ(II)V

    iget-object p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    if-nez p2, :cond_0

    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method public final ۥ۟۟ۡۡ(CII)V
    .locals 0

    invoke-virtual {p0, p2, p3}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۧ(II)V

    iget-object p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۥ۟۟ۡۢ(Ljava/lang/String;II)V
    .locals 0

    invoke-virtual {p0, p2, p3}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۧ(II)V

    iget-object p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    if-nez p2, :cond_0

    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method public final ۥۣ۟۟ۡ([III)V
    .locals 2

    invoke-virtual {p0, p2, p3}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۧ(II)V

    array-length p2, p1

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_0

    aget v0, p1, p3

    iget-object v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۥ۟۟ۡۤ(C)V
    .locals 0

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۥ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۥ۟۟ۡۥ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0xfffd

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    invoke-static {p1}, LYue/ۥۣۡۧۥ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    return-void
.end method

.method public final ۥ۟۟ۡۦ(II)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۢ:Z

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_0
    iget-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۨ:Z

    if-eqz v0, :cond_2

    iget v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_1

    move p1, v0

    :cond_1
    iput p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ:I

    iput p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۟:I

    :cond_2
    return-void
.end method

.method public final ۥ۟۟ۡۧ(II)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۥ:Z

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    :cond_0
    iget-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۨ:Z

    if-eqz v0, :cond_2

    iget v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۠:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_1

    move p1, v0

    :cond_1
    iput p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۠:I

    iput p2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۡ:I

    :cond_2
    return-void
.end method

.method public final ۥ۟۟ۡۨ()V
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۢ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۤ()V

    :cond_0
    return-void
.end method

.method public final ۥ۟۟ۢ(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۡ۟(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥ۟۟ۢ۟(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۡ۠(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥ۟۟ۢ۠()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟ۢۡ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ:Z

    return v0
.end method

.method public final ۥ۟۟ۢۢ(Ljava/lang/String;)LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;
    .locals 0

    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    invoke-static {p1}, LYue/ۥۣۡۧۥ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    return-object p0
.end method

.method public final ۥۣ۟۟ۢ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟۠(Z)V

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟ۢۤ()V
    .locals 3

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۢ۠ۤ;

    invoke-direct {v0}, LYue/ۥ۟ۢ۠ۤ;-><init>()V

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    :cond_0
    iget-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۢ:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    invoke-virtual {v0}, LYue/ۥ۟ۢ۠ۤ;->size()I

    move-result v0

    const/16 v1, 0x200

    if-ge v0, v1, :cond_5

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    iget-boolean v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۥ:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    iget-object v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    goto :goto_1

    :cond_3
    iget-boolean v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۦ:Z

    if-eqz v1, :cond_4

    const-string v1, ""

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    iget-object v2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    invoke-virtual {v2, v0, v1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟۟۠(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۢ۠ۤ;

    invoke-virtual {p0, v0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥۣ۟۟۟(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۧ()V

    return-void
.end method

.method public final ۥ۟۟ۢۥ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟ۢۦ()LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;
    .locals 2

    invoke-super {p0}, LYue/ۥۢۡۧ۠;->ۥ۟۟۠ۢ()LYue/ۥۢۡۧ۠;

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ:Z

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۧ()V

    return-object p0
.end method

.method public final ۥ۟۟ۢۧ()V
    .locals 3

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۡ:Ljava/lang/StringBuilder;

    invoke-static {v0}, LYue/ۥۢۡۧ۠;->ۥۣ۟۟۠(Ljava/lang/StringBuilder;)V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۢ:Z

    iget-object v2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۤ:Ljava/lang/StringBuilder;

    invoke-static {v2}, LYue/ۥۢۡۧ۠;->ۥۣ۟۟۠(Ljava/lang/StringBuilder;)V

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    iput-boolean v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۦ:Z

    iput-boolean v1, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۥ:Z

    iget-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۨ:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۡ:I

    iput v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۠:I

    iput v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۟:I

    iput v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ:I

    :cond_0
    return-void
.end method

.method public final ۥ۟۟ۢۨ()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۦ:Z

    return-void
.end method

.method public final ۥۣ۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "[unset]"

    :goto_0
    return-object v0
.end method

.method public final ۥۣ۟۟۟(Ljava/lang/String;)V
    .locals 10

    iget-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۨ:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠;->ۥ۟۟۠۠()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠;->ۥ۟۟۟ۡ()LYue/ۥۢۡۧ۠$ۥ۟۟۟ۢ;

    move-result-object v0

    iget-object v0, v0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۧ:LYue/ۥۢۢۡۧ;

    iget-object v1, v0, LYue/ۥۢۢۡۧ;->ۥ۟:LYue/ۥۣ۟ۤۤ;

    iget-object v0, v0, LYue/ۥۢۢۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۣۡۧۥ;

    invoke-virtual {v0}, LYue/ۥۣۡۧۥ;->ۥ۟۟۟۟()Z

    move-result v0

    iget-object v2, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    const-string v3, "jsoup.attrs"

    invoke-virtual {v2, v3}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v4, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡ۟:LYue/ۥ۟ۢ۠ۤ;

    invoke-virtual {v4, v3, v2}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۢۥ(Ljava/lang/String;Ljava/lang/Object;)LYue/ۥ۟ۢ۠ۤ;

    :cond_0
    if-nez v0, :cond_1

    invoke-static {p1}, LYue/ۥۡۢۤۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    iget-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۡۥ:Z

    if-nez v0, :cond_3

    iget v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۟:I

    iput v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۡ:I

    iput v0, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۠:I

    :cond_3
    new-instance v0, LYue/ۥۡۥۨۦ$ۥ;

    new-instance v3, LYue/ۥۡۥۨۦ;

    new-instance v4, LYue/ۥۡۥۨۦ$ۥ۟;

    iget v5, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ:I

    invoke-virtual {v1, v5}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۡ۠(I)I

    move-result v6

    iget v7, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ:I

    invoke-virtual {v1, v7}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟۠(I)I

    move-result v7

    invoke-direct {v4, v5, v6, v7}, LYue/ۥۡۥۨۦ$ۥ۟;-><init>(III)V

    new-instance v5, LYue/ۥۡۥۨۦ$ۥ۟;

    iget v6, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۟:I

    invoke-virtual {v1, v6}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۡ۠(I)I

    move-result v7

    iget v8, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۟:I

    invoke-virtual {v1, v8}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟۠(I)I

    move-result v8

    invoke-direct {v5, v6, v7, v8}, LYue/ۥۡۥۨۦ$ۥ۟;-><init>(III)V

    invoke-direct {v3, v4, v5}, LYue/ۥۡۥۨۦ;-><init>(LYue/ۥۡۥۨۦ$ۥ۟;LYue/ۥۡۥۨۦ$ۥ۟;)V

    new-instance v4, LYue/ۥۡۥۨۦ;

    new-instance v5, LYue/ۥۡۥۨۦ$ۥ۟;

    iget v6, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۠:I

    invoke-virtual {v1, v6}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۡ۠(I)I

    move-result v7

    iget v8, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢ۠:I

    invoke-virtual {v1, v8}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟۠(I)I

    move-result v8

    invoke-direct {v5, v6, v7, v8}, LYue/ۥۡۥۨۦ$ۥ۟;-><init>(III)V

    new-instance v6, LYue/ۥۡۥۨۦ$ۥ۟;

    iget v7, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۡ:I

    invoke-virtual {v1, v7}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۡ۠(I)I

    move-result v8

    iget v9, p0, LYue/ۥۢۡۧ۠$ۥۣ۟۟۟;->ۥ۟۟ۢۡ:I

    invoke-virtual {v1, v9}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟۠(I)I

    move-result v1

    invoke-direct {v6, v7, v8, v1}, LYue/ۥۡۥۨۦ$ۥ۟;-><init>(III)V

    invoke-direct {v4, v5, v6}, LYue/ۥۡۥۨۦ;-><init>(LYue/ۥۡۥۨۦ$ۥ۟;LYue/ۥۡۥۨۦ$ۥ۟;)V

    invoke-direct {v0, v3, v4}, LYue/ۥۡۥۨۦ$ۥ;-><init>(LYue/ۥۡۥۨۦ;LYue/ۥۡۥۨۦ;)V

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method
