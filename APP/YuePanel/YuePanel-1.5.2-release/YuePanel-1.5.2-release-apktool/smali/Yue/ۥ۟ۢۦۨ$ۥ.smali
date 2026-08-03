.class public final LYue/ۥ۟ۢۦۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۢۦۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:I

.field public ۥ۟۟:LYue/ۥۢۡ۠۠;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۤ(Ljava/util/Locale;)Z

    move-result v0

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟۟(Z)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-static {p1}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۤ(Ljava/util/Locale;)Z

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟۟(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟۟(Z)V

    return-void
.end method

.method public static ۥ۟(Z)LYue/ۥ۟ۢۦۨ;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠۟:LYue/ۥ۟ۢۦۨ;

    goto :goto_0

    :cond_0
    sget-object p0, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۠:LYue/ۥ۟ۢۦۨ;

    :goto_0
    return-object p0
.end method


# virtual methods
.method public ۥ()LYue/ۥ۟ۢۦۨ;
    .locals 4

    iget v0, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    sget-object v1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟:LYue/ۥۢۡ۠۠;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ:Z

    invoke-static {v0}, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟(Z)LYue/ۥ۟ۢۦۨ;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, LYue/ۥ۟ۢۦۨ;

    iget-boolean v1, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ:Z

    iget v2, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟:I

    iget-object v3, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    invoke-direct {v0, v1, v2, v3}, LYue/ۥ۟ۢۦۨ;-><init>(ZILYue/ۥۢۡ۠۠;)V

    return-object v0
.end method

.method public final ۥ۟۟(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ:Z

    sget-object p1, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟:LYue/ۥۢۡ۠۠;

    iput-object p1, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    const/4 p1, 0x2

    iput p1, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟:I

    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥۢۡ۠۠;)LYue/ۥ۟ۢۦۨ$ۥ;
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟۟:LYue/ۥۢۡ۠۠;

    return-object p0
.end method

.method public ۥ۟۟۟۟(Z)LYue/ۥ۟ۢۦۨ$ۥ;
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟:I

    goto :goto_0

    :cond_0
    iget p1, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟:I

    and-int/lit8 p1, p1, -0x3

    iput p1, p0, LYue/ۥ۟ۢۦۨ$ۥ;->ۥ۟:I

    :goto_0
    return-object p0
.end method
