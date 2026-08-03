.class public final LYue/ۥۢۥۣۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥۣۡ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۡ:LYue/ۥۢۥۣۡ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "Sec-WebSocket-Extensions"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:Z
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public final ۥ۟:Ljava/lang/Integer;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟:Z
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public final ۥ۟۟۟:Ljava/lang/Integer;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:Z
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public final ۥ۟۟۟۠:Z
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢۥۣۡ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۢۥۣۡ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟ۡ:LYue/ۥۢۥۣۡ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v8}, LYue/ۥۢۥۣۡ;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V
    .locals 0
    .param p2    # Ljava/lang/Integer;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LYue/ۥۢۥۣۡ;->ۥ:Z

    .line 4
    iput-object p2, p0, LYue/ۥۢۥۣۡ;->ۥ۟:Ljava/lang/Integer;

    .line 5
    iput-boolean p3, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟:Z

    .line 6
    iput-object p4, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟:Ljava/lang/Integer;

    .line 7
    iput-boolean p5, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۟:Z

    .line 8
    iput-boolean p6, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۠:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZILYue/ۥ۟ۨۥۢ;)V
    .locals 5

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p8, v0

    goto :goto_0

    :cond_0
    move p8, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    move-object v2, p2

    :goto_1
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    move v3, p3

    :goto_2
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, p4

    :goto_3
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    move v4, v0

    goto :goto_4

    :cond_4
    move v4, p5

    :goto_4
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_5

    move p7, v0

    goto :goto_5

    :cond_5
    move p7, p6

    :goto_5
    move-object p1, p0

    move p2, p8

    move-object p3, v2

    move p4, v3

    move-object p5, v1

    move p6, v4

    .line 9
    invoke-direct/range {p1 .. p7}, LYue/ۥۢۥۣۡ;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۢ(LYue/ۥۢۥۣۡ;ZLjava/lang/Integer;ZLjava/lang/Integer;ZZILjava/lang/Object;)LYue/ۥۢۥۣۡ;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, LYue/ۥۢۥۣۡ;->ۥ:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, LYue/ۥۢۥۣۡ;->ۥ۟:Ljava/lang/Integer;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟:Ljava/lang/Integer;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۟:Z

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۠:Z

    :cond_5
    move v3, p6

    move-object p2, p0

    move p3, p1

    move-object p4, p8

    move p5, v0

    move-object p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, LYue/ۥۢۥۣۡ;->ۥ۟۟۟ۡ(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)LYue/ۥۢۥۣۡ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥۢۥۣۡ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥۢۥۣۡ;

    iget-boolean v1, p0, LYue/ۥۢۥۣۡ;->ۥ:Z

    iget-boolean v3, p1, LYue/ۥۢۥۣۡ;->ۥ:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟:Ljava/lang/Integer;

    iget-object v3, p1, LYue/ۥۢۥۣۡ;->ۥ۟:Ljava/lang/Integer;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟:Z

    iget-boolean v3, p1, LYue/ۥۢۥۣۡ;->ۥ۟۟:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟:Ljava/lang/Integer;

    iget-object v3, p1, LYue/ۥۢۥۣۡ;->ۥ۟۟۟:Ljava/lang/Integer;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۟:Z

    iget-boolean v3, p1, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۟:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۠:Z

    iget-boolean p1, p1, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۠:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, LYue/ۥۢۥۣۡ;->ۥ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥۢۥۣۡ;->ۥ۟:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟:Ljava/lang/Integer;

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۟:Z

    if-eqz v2, :cond_4

    move v2, v1

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۠:Z

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    move v1, v2

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WebSocketExtensions(perMessageDeflate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LYue/ۥۢۥۣۡ;->ۥ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", clientMaxWindowBits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientNoContextTakeover="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", serverMaxWindowBits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", serverNoContextTakeover="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۟:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", unknownValues="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۠:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۥۣۡ;->ۥ:Z

    return v0
.end method

.method public final ۥ۟()Ljava/lang/Integer;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۡ;->ۥ۟:Ljava/lang/Integer;

    return-object v0
.end method

.method public final ۥ۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟:Z

    return v0
.end method

.method public final ۥ۟۟۟()Ljava/lang/Integer;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟:Ljava/lang/Integer;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۟:Z

    return v0
.end method

.method public final ۥ۟۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۠:Z

    return v0
.end method

.method public final ۥ۟۟۟ۡ(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)LYue/ۥۢۥۣۡ;
    .locals 8
    .param p2    # Ljava/lang/Integer;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v7, LYue/ۥۢۥۣۡ;

    move-object v0, v7

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, LYue/ۥۢۥۣۡ;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    return-object v7
.end method

.method public final ۥۣ۟۟۟(Z)Z
    .locals 0

    if-eqz p1, :cond_0

    iget-boolean p1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟:Z

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, LYue/ۥۢۥۣۡ;->ۥ۟۟۟۟:Z

    :goto_0
    return p1
.end method
