.class public LYue/ۥۡۥۨۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۥۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥۡۥۨۦ$ۥ;


# instance fields
.field public final ۥ:LYue/ۥۡۥۨۦ;

.field public final ۥ۟:LYue/ۥۡۥۨۦ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۥۨۦ$ۥ;

    sget-object v1, LYue/ۥۡۥۨۦ;->ۥ۟۟۟:LYue/ۥۡۥۨۦ;

    invoke-direct {v0, v1, v1}, LYue/ۥۡۥۨۦ$ۥ;-><init>(LYue/ۥۡۥۨۦ;LYue/ۥۡۥۨۦ;)V

    sput-object v0, LYue/ۥۡۥۨۦ$ۥ;->ۥ۟۟:LYue/ۥۡۥۨۦ$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۥۨۦ;LYue/ۥۡۥۨۦ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۥۨۦ$ۥ;->ۥ:LYue/ۥۡۥۨۦ;

    iput-object p2, p0, LYue/ۥۡۥۨۦ$ۥ;->ۥ۟:LYue/ۥۡۥۨۦ;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LYue/ۥۡۥۨۦ$ۥ;

    iget-object v1, p0, LYue/ۥۡۥۨۦ$ۥ;->ۥ:LYue/ۥۡۥۨۦ;

    iget-object v2, p1, LYue/ۥۡۥۨۦ$ۥ;->ۥ:LYue/ۥۡۥۨۦ;

    invoke-virtual {v1, v2}, LYue/ۥۡۥۨۦ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, LYue/ۥۡۥۨۦ$ۥ;->ۥ۟:LYue/ۥۡۥۨۦ;

    iget-object p1, p1, LYue/ۥۡۥۨۦ$ۥ;->ۥ۟:LYue/ۥۡۥۨۦ;

    invoke-virtual {v0, p1}, LYue/ۥۡۥۨۦ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYue/ۥۡۥۨۦ$ۥ;->ۥ:LYue/ۥۡۥۨۦ;

    invoke-virtual {v0}, LYue/ۥۡۥۨۦ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LYue/ۥۡۥۨۦ$ۥ;->ۥ۟:LYue/ۥۡۥۨۦ;

    invoke-virtual {v1}, LYue/ۥۡۥۨۦ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LYue/ۥۡۥۨۦ$ۥ;->ۥ()LYue/ۥۡۥۨۦ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۡۥۨۦ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۡۥۨۦ$ۥ;->ۥ۟()LYue/ۥۡۥۨۦ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۡۥۨۦ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()LYue/ۥۡۥۨۦ;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۨۦ$ۥ;->ۥ:LYue/ۥۡۥۨۦ;

    return-object v0
.end method

.method public ۥ۟()LYue/ۥۡۥۨۦ;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۥۨۦ$ۥ;->ۥ۟:LYue/ۥۡۥۨۦ;

    return-object v0
.end method
