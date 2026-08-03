.class public final L۟/o5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:L۟/p1;

.field public final ۥ۟:L۟/o1;

.field public final ۥ۟۟:Ljava/lang/String;

.field public final ۥ۟۠:Ljava/lang/Boolean;

.field public ۥ۟ۡ:Ljava/lang/Integer;

.field public final ۥ۟ۢ:L۟/wb;


# direct methods
.method public constructor <init>(L۟/p1;L۟/o1;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;L۟/wb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/o5;->ۥ:L۟/p1;

    iput-object p2, p0, L۟/o5;->ۥ۟:L۟/o1;

    iput-object p3, p0, L۟/o5;->ۥ۟۟:Ljava/lang/String;

    iput-object p4, p0, L۟/o5;->ۥ۟۠:Ljava/lang/Boolean;

    iput-object p5, p0, L۟/o5;->ۥ۟ۡ:Ljava/lang/Integer;

    iput-object p6, p0, L۟/o5;->ۥ۟ۢ:L۟/wb;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, L۟/o5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, L۟/o5;

    iget-object v1, p0, L۟/o5;->ۥ:L۟/p1;

    iget-object v3, p1, L۟/o5;->ۥ:L۟/p1;

    invoke-static {v1, v3}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, L۟/o5;->ۥ۟:L۟/o1;

    iget-object v3, p1, L۟/o5;->ۥ۟:L۟/o1;

    invoke-static {v1, v3}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, L۟/o5;->ۥ۟۟:Ljava/lang/String;

    iget-object v3, p1, L۟/o5;->ۥ۟۟:Ljava/lang/String;

    invoke-static {v1, v3}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, L۟/o5;->ۥ۟۠:Ljava/lang/Boolean;

    iget-object v3, p1, L۟/o5;->ۥ۟۠:Ljava/lang/Boolean;

    invoke-static {v1, v3}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, L۟/o5;->ۥ۟ۡ:Ljava/lang/Integer;

    iget-object v3, p1, L۟/o5;->ۥ۟ۡ:Ljava/lang/Integer;

    invoke-static {v1, v3}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, L۟/o5;->ۥ۟ۢ:L۟/wb;

    iget-object p1, p1, L۟/o5;->ۥ۟ۢ:L۟/wb;

    invoke-static {v1, p1}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, L۟/o5;->ۥ:L۟/p1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, L۟/p1;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, L۟/o5;->ۥ۟:L۟/o1;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, L۟/o1;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, L۟/o5;->ۥ۟۟:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, L۟/o5;->ۥ۟۠:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, L۟/o5;->ۥ۟ۡ:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, L۟/o5;->ۥ۟ۢ:L۟/wb;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, L۟/wb;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
