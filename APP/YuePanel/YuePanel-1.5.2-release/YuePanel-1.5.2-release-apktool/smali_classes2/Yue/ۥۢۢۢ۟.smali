.class public final LYue/ۥۢۢۢ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        "C:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TB;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TC;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;TB;TC;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۢۢ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p2, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p3, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥۢۢۢ۟;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)LYue/ۥۢۢۢ۟;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, LYue/ۥۢۢۢ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۢۢۢ۟;->ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۢۢۢ۟;

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
    instance-of v1, p1, LYue/ۥۢۢۢ۟;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥۢۢۢ۟;

    iget-object v1, p0, LYue/ۥۢۢۢ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iget-object v3, p1, LYue/ۥۢۢۢ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iget-object v3, p1, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iget-object p1, p1, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LYue/ۥۢۢۢ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢۢۢ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۢ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۢۢۢ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;TB;TC;)",
            "LYue/\u06e5\u06e2\u06e2\u06e2\u06df<",
            "TA;TB;TC;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢۢۢ۟;

    invoke-direct {v0, p1, p2, p3}, LYue/ۥۢۢۢ۟;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ۥ۟۟۟۠()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۢ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۢ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    return-object v0
.end method
