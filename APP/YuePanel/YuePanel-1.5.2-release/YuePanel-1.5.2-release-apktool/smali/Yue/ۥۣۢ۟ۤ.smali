.class public LYue/ۥۣۢ۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۡۨۥ$ۥ;


# static fields
.field public static final ۥ۟۟۟ۨ:Z = false

.field public static final ۥ۟۟۠:Z = true

.field public static ۥ۟۟۠۟:F = 0.001f


# instance fields
.field public final ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:[I

.field public ۥ۟۟۟۟:[I

.field public ۥ۟۟۟۠:[I

.field public ۥ۟۟۟ۡ:[F

.field public ۥ۟۟۟ۢ:[I

.field public ۥۣ۟۟۟:[I

.field public ۥ۟۟۟ۤ:I

.field public ۥ۟۟۟ۥ:I

.field public final ۥ۟۟۟ۦ:LYue/ۥ۟ۡۨۥ;

.field public final ۥ۟۟۟ۧ:LYue/ۥۣ۟ۥۨ;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LYue/ۥ۟ۡۨۥ;LYue/ۥۣ۟ۥۨ;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ:I

    const/16 v1, 0x10

    iput v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟:I

    iput v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟:I

    new-array v2, v1, [I

    iput-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟:[I

    new-array v2, v1, [I

    iput-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    new-array v2, v1, [I

    iput-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    new-array v2, v1, [F

    iput-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    new-array v2, v1, [I

    iput-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    new-array v1, v1, [I

    iput-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    const/4 v1, 0x0

    iput v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    iput v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    iput-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۦ:LYue/ۥ۟ۡۨۥ;

    iput-object p2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۧ:LYue/ۥۣ۟ۥۨ;

    invoke-virtual {p0}, LYue/ۥۣۢ۟ۤ;->clear()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 5

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟(I)LYue/ۥۣۣۢ۟;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۦ:LYue/ۥ۟ۡۨۥ;

    invoke-virtual {v3, v4}, LYue/ۥۣۣۢ۟;->ۥ۟۟۟۠(LYue/ۥ۟ۡۨۥ;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_1
    iget v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟:I

    const/4 v3, -0x1

    if-ge v0, v2, :cond_2

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aput v3, v2, v0

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    aput v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_2
    iget v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟:I

    if-ge v0, v2, :cond_3

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟:[I

    aput v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iput v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    iput v3, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    return-void
.end method

.method public getCurrentSize()I
    .locals 1

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " { "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p0, v2}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟(I)LYue/ۥۣۣۢ۟;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ(I)F

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ(LYue/ۥۣۣۢ۟;)I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "[p: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    aget v4, v4, v3

    const-string v5, "none"

    const/4 v6, -0x1

    if-eq v4, v6, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۧ:LYue/ۥۣ۟ۥۨ;

    iget-object v0, v0, LYue/ۥۣ۟ۥۨ;->ۥ۟۟۟:[LYue/ۥۣۣۢ۟;

    iget-object v7, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    iget-object v8, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    aget v8, v8, v3

    aget v7, v7, v8

    aget-object v0, v0, v7

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", n: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v4, v4, v3

    if-eq v4, v6, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۧ:LYue/ۥۣ۟ۥۨ;

    iget-object v0, v0, LYue/ۥۣ۟ۥۨ;->ۥ۟۟۟:[LYue/ۥۣۣۢ۟;

    iget-object v5, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    iget-object v6, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v3, v6, v3

    aget v3, v5, v3

    aget-object v0, v0, v3

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " }"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥ۟ۡۨۥ;Z)F
    .locals 7

    iget-object v0, p1, LYue/ۥ۟ۡۨۥ;->ۥ:LYue/ۥۣۣۢ۟;

    invoke-virtual {p0, v0}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ(LYue/ۥۣۣۢ۟;)F

    move-result v0

    iget-object v1, p1, LYue/ۥ۟ۡۨۥ;->ۥ:LYue/ۥۣۣۢ۟;

    invoke-virtual {p0, v1, p2}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟(LYue/ۥۣۣۢ۟;Z)F

    iget-object p1, p1, LYue/ۥ۟ۡۨۥ;->ۥ۟۟۟۟:LYue/ۥ۟ۡۨۥ$ۥ;

    check-cast p1, LYue/ۥۣۢ۟ۤ;

    invoke-virtual {p1}, LYue/ۥۣۢ۟ۤ;->getCurrentSize()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v4, p1, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v4, v4, v3

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    iget-object v5, p1, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aget v5, v5, v3

    iget-object v6, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۧ:LYue/ۥۣ۟ۥۨ;

    iget-object v6, v6, LYue/ۥۣ۟ۥۨ;->ۥ۟۟۟:[LYue/ۥۣۣۢ۟;

    aget-object v4, v6, v4

    mul-float/2addr v5, v0

    invoke-virtual {p0, v4, v5, p2}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ(LYue/ۥۣۣۢ۟;FZ)V

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public ۥ۟()V
    .locals 5

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "{ "

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟(I)LYue/ۥۣۣۢ۟;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " = "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ(I)F

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟(LYue/ۥۣۣۢ۟;Z)F
    .locals 7

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ(LYue/ۥۣۣۢ۟;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۠(LYue/ۥۣۣۢ۟;)V

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aget v2, v2, v0

    iget v3, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    if-ne v3, v0, :cond_1

    iget-object v3, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v3, v3, v0

    iput v3, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    :cond_1
    iget-object v3, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aput v1, v3, v0

    iget-object v3, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    aget v4, v3, v0

    if-eq v4, v1, :cond_2

    iget-object v5, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v6, v5, v0

    aput v6, v5, v4

    :cond_2
    iget-object v4, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v4, v4, v0

    if-eq v4, v1, :cond_3

    aget v0, v3, v0

    aput v0, v3, v4

    :cond_3
    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    iget v0, p1, LYue/ۥۣۣۢ۟;->ۥ۟۟۟ۧ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, LYue/ۥۣۣۢ۟;->ۥ۟۟۟ۧ:I

    if-eqz p2, :cond_4

    iget-object p2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۦ:LYue/ۥ۟ۡۨۥ;

    invoke-virtual {p1, p2}, LYue/ۥۣۣۢ۟;->ۥ۟۟۟۠(LYue/ۥ۟ۡۨۥ;)V

    :cond_4
    return v2
.end method

.method public ۥ۟۟۟(LYue/ۥۣۣۢ۟;F)V
    .locals 7

    sget v0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۠۟:F

    neg-float v1, v0

    cmpl-float v1, p2, v1

    const/4 v2, 0x1

    if-lez v1, :cond_0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    invoke-virtual {p0, p1, v2}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟(LYue/ۥۣۣۢ۟;Z)F

    return-void

    :cond_0
    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0, v1, p1, p2}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۠(ILYue/ۥۣۣۢ۟;F)V

    invoke-virtual {p0, p1, v1}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۨ(LYue/ۥۣۣۢ۟;I)V

    iput v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    goto :goto_2

    :cond_1
    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ(LYue/ۥۣۣۢ۟;)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_2

    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aput p2, p1, v0

    goto :goto_2

    :cond_2
    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    add-int/2addr v0, v2

    iget v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟:I

    if-lt v0, v2, :cond_3

    invoke-virtual {p0}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۠ۡ()V

    :cond_3
    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    iget v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    move v4, v3

    :goto_0
    if-ge v1, v0, :cond_7

    iget-object v5, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v5, v5, v2

    iget v6, p1, LYue/ۥۣۣۢ۟;->ۥ۟۟:I

    if-ne v5, v6, :cond_4

    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aput p2, p1, v2

    return-void

    :cond_4
    if-ge v5, v6, :cond_5

    move v4, v2

    :cond_5
    iget-object v5, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v2, v5, v2

    if-ne v2, v3, :cond_6

    goto :goto_1

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    :goto_1
    invoke-virtual {p0, v4, p1, p2}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۠ۢ(ILYue/ۥۣۣۢ۟;F)V

    :goto_2
    return-void
.end method

.method public ۥ۟۟۟۟(I)LYue/ۥۣۣۢ۟;
    .locals 6

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    const/4 v4, -0x1

    if-ne v3, p1, :cond_1

    if-eq v2, v4, :cond_1

    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۧ:LYue/ۥۣ۟ۥۨ;

    iget-object p1, p1, LYue/ۥۣ۟ۥۨ;->ۥ۟۟۟:[LYue/ۥۣۣۢ۟;

    iget-object v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v0, v0, v2

    aget-object p1, p1, v0

    return-object p1

    :cond_1
    iget-object v5, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v2, v5, v2

    if-ne v2, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public ۥ۟۟۟۠()V
    .locals 6

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    iget v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aget v4, v3, v1

    const/high16 v5, -0x40800000    # -1.0f

    mul-float/2addr v4, v5

    aput v4, v3, v1

    iget-object v3, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v1, v3, v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public ۥ۟۟۟ۡ(I)F
    .locals 4

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    iget v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    if-ne v2, p1, :cond_0

    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aget p1, p1, v1

    return p1

    :cond_0
    iget-object v3, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v1, v3, v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥۣۣۢ۟;)F
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ(LYue/ۥۣۣۢ۟;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aget p1, v0, p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ۥۣ۟۟۟(LYue/ۥۣۣۢ۟;)Z
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ(LYue/ۥۣۣۢ۟;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥۣۣۢ۟;FZ)V
    .locals 4

    sget v0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۠۟:F

    neg-float v1, v0

    cmpl-float v1, p2, v1

    if-lez v1, :cond_0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ(LYue/ۥۣۣۢ۟;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟(LYue/ۥۣۣۢ۟;F)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aget v2, v1, v0

    add-float/2addr v2, p2

    aput v2, v1, v0

    sget p2, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۠۟:F

    neg-float v3, p2

    cmpl-float v3, v2, v3

    if-lez v3, :cond_2

    cmpg-float p2, v2, p2

    if-gez p2, :cond_2

    const/4 p2, 0x0

    aput p2, v1, v0

    invoke-virtual {p0, p1, p3}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟(LYue/ۥۣۣۢ۟;Z)F

    :cond_2
    :goto_0
    return-void
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥۣۣۢ۟;)I
    .locals 3

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    const/4 v1, -0x1

    if-eqz v0, :cond_5

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget p1, p1, LYue/ۥۣۣۢ۟;->ۥ۟۟:I

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟:I

    rem-int v0, p1, v0

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟:[I

    aget v0, v2, v0

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    aget v0, v2, v0

    if-eq v0, v1, :cond_3

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v2, v2, v0

    if-eq v2, p1, :cond_3

    goto :goto_0

    :cond_3
    if-ne v0, v1, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_5

    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public ۥ۟۟۟ۦ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟ۧ(F)V
    .locals 5

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    iget v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aget v4, v3, v1

    div-float/2addr v4, p1

    aput v4, v3, v1

    iget-object v3, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v1, v3, v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ۥ۟۟۟ۨ(LYue/ۥۣۣۢ۟;I)V
    .locals 3

    iget p1, p1, LYue/ۥۣۣۢ۟;->ۥ۟۟:I

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟:I

    rem-int/2addr p1, v0

    iget-object v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟:[I

    aget v1, v0, p1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    aput p2, v0, p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    aget v0, p1, v1

    if-eq v0, v2, :cond_1

    move v1, v0

    goto :goto_0

    :cond_1
    aput p2, p1, v1

    :goto_1
    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    aput v2, p1, p2

    return-void
.end method

.method public final ۥ۟۟۠(ILYue/ۥۣۣۢ۟;F)V
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    iget v1, p2, LYue/ۥۣۣۢ۟;->ۥ۟۟:I

    aput v1, v0, p1

    iget-object v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    aput p3, v0, p1

    iget-object p3, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    const/4 v0, -0x1

    aput v0, p3, p1

    iget-object p3, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aput v0, p3, p1

    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۦ:LYue/ۥ۟ۡۨۥ;

    invoke-virtual {p2, p1}, LYue/ۥۣۣۢ۟;->ۥ(LYue/ۥ۟ۡۨۥ;)V

    iget p1, p2, LYue/ۥۣۣۢ۟;->ۥ۟۟۟ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p2, LYue/ۥۣۣۢ۟;->ۥ۟۟۟ۧ:I

    iget p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    return-void
.end method

.method public final ۥ۟۟۠۟()V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟:I

    if-ge v1, v2, :cond_3

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟:[I

    aget v2, v2, v1

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " hash ["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "] => "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟:[I

    aget v4, v4, v1

    move v5, v0

    :goto_1
    if-nez v5, :cond_1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v2, v2, v4

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v6, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    aget v6, v6, v4

    if-eq v6, v3, :cond_0

    move v4, v6

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ۥ۟۟۠۠()I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v1, v1, v0

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final ۥ۟۟۠ۡ()V
    .locals 4

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۡ:[F

    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    iget v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟:I

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    const/4 v3, -0x1

    aput v3, v2, v1

    iget-object v2, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟:I

    return-void
.end method

.method public final ۥ۟۟۠ۢ(ILYue/ۥۣۣۢ۟;F)V
    .locals 3

    invoke-virtual {p0}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۠۠()I

    move-result v0

    invoke-virtual {p0, v0, p2, p3}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۠(ILYue/ۥۣۣۢ۟;F)V

    const/4 p3, -0x1

    if-eq p1, p3, :cond_0

    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    aput p1, v1, v0

    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget v2, v1, p1

    aput v2, v1, v0

    aput v0, v1, p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    aput p3, p1, v0

    iget p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۤ:I

    if-lez p1, :cond_1

    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    iget v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    aput v1, p1, v0

    iput v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۥ:I

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aput p3, p1, v0

    :goto_0
    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥۣ۟۟۟:[I

    aget p1, p1, v0

    if-eq p1, p3, :cond_2

    iget-object p3, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۢ:[I

    aput v0, p3, p1

    :cond_2
    invoke-virtual {p0, p2, v0}, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟ۨ(LYue/ۥۣۣۢ۟;I)V

    return-void
.end method

.method public final ۥۣ۟۟۠(LYue/ۥۣۣۢ۟;)V
    .locals 5

    iget p1, p1, LYue/ۥۣۣۢ۟;->ۥ۟۟:I

    iget v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟:I

    rem-int v0, p1, v0

    iget-object v1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟:[I

    aget v2, v1, v0

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    return-void

    :cond_0
    iget-object v4, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v4, v4, v2

    if-ne v4, p1, :cond_1

    iget-object p1, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    aget v4, p1, v2

    aput v4, v1, v0

    aput v3, p1, v2

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۟:[I

    aget v1, v0, v2

    if-eq v1, v3, :cond_2

    iget-object v4, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v4, v4, v1

    if-eq v4, p1, :cond_2

    move v2, v1

    goto :goto_0

    :cond_2
    if-eq v1, v3, :cond_3

    iget-object v4, p0, LYue/ۥۣۢ۟ۤ;->ۥ۟۟۟۠:[I

    aget v4, v4, v1

    if-ne v4, p1, :cond_3

    aget p1, v0, v1

    aput p1, v0, v2

    aput v3, v0, v1

    :cond_3
    :goto_1
    return-void
.end method
