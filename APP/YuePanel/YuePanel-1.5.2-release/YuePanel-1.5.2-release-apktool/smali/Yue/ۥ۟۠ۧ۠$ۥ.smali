.class public LYue/ۥ۟۠ۧ۠$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۧ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "[",
        "LYue/\u06e5\u06e1\u06e3\u06e8\u06e3$\u06e5\u06df;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥ:[LYue/ۥۣۣۡۨ$ۥ۟;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([LYue/ۥۣۣۡۨ$ۥ۟;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥ۟۠ۧ۠$ۥ;->ۥ:[LYue/ۥۣۣۡۨ$ۥ۟;

    return-void
.end method


# virtual methods
.method public bridge synthetic evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, [LYue/ۥۣۣۡۨ$ۥ۟;

    check-cast p3, [LYue/ۥۣۣۡۨ$ۥ۟;

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟۠ۧ۠$ۥ;->ۥ(F[LYue/ۥۣۣۡۨ$ۥ۟;[LYue/ۥۣۣۡۨ$ۥ۟;)[LYue/ۥۣۣۡۨ$ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ(F[LYue/ۥۣۣۡۨ$ۥ۟;[LYue/ۥۣۣۡۨ$ۥ۟;)[LYue/ۥۣۣۡۨ$ۥ۟;
    .locals 4

    invoke-static {p2, p3}, LYue/ۥۣۣۡۨ;->ۥ۟([LYue/ۥۣۣۡۨ$ۥ۟;[LYue/ۥۣۣۡۨ$ۥ۟;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥ۟۠ۧ۠$ۥ;->ۥ:[LYue/ۥۣۣۡۨ$ۥ۟;

    invoke-static {v0, p2}, LYue/ۥۣۣۡۨ;->ۥ۟([LYue/ۥۣۣۡۨ$ۥ۟;[LYue/ۥۣۣۡۨ$ۥ۟;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, LYue/ۥۣۣۡۨ;->ۥ۟۟۟۠([LYue/ۥۣۣۡۨ$ۥ۟;)[LYue/ۥۣۣۡۨ$ۥ۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟۠ۧ۠$ۥ;->ۥ:[LYue/ۥۣۣۡۨ$ۥ۟;

    :cond_0
    const/4 v0, 0x0

    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥ۟۠ۧ۠$ۥ;->ۥ:[LYue/ۥۣۣۡۨ$ۥ۟;

    aget-object v1, v1, v0

    aget-object v2, p2, v0

    aget-object v3, p3, v0

    invoke-virtual {v1, v2, v3, p1}, LYue/ۥۣۣۡۨ$ۥ۟;->ۥ۟۟۟ۤ(LYue/ۥۣۣۡۨ$ۥ۟;LYue/ۥۣۣۡۨ$ۥ۟;F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥ۟۠ۧ۠$ۥ;->ۥ:[LYue/ۥۣۣۡۨ$ۥ۟;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Can\'t interpolate between two incompatible pathData"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
