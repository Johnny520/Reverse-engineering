.class public LYue/ۥۣۣۡۧ;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "LYue/\u06e5\u06e1\u06e3\u06e7\u06e2;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۥ:I = 0x10


# instance fields
.field public final ۥۣ۟۟۠:I

.field public final ۥ۟۟۠ۤ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    iput p1, p0, LYue/ۥۣۣۡۧ;->ۥۣ۟۟۠:I

    .line 3
    iput p2, p0, LYue/ۥۣۣۡۧ;->ۥ۟۟۠ۤ:I

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۣۡۧ;)V
    .locals 1

    .line 4
    iget v0, p1, LYue/ۥۣۣۡۧ;->ۥۣ۟۟۠:I

    iget p1, p1, LYue/ۥۣۣۡۧ;->ۥ۟۟۠ۤ:I

    invoke-direct {p0, v0, p1}, LYue/ۥۣۣۡۧ;-><init>(II)V

    return-void
.end method

.method public static ۥ۟۟۟۟()LYue/ۥۣۣۡۧ;
    .locals 2

    new-instance v0, LYue/ۥۣۣۡۧ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, LYue/ۥۣۣۡۧ;-><init>(II)V

    return-object v0
.end method

.method public static ۥ۟۟۟۠(I)LYue/ۥۣۣۡۧ;
    .locals 2

    new-instance v0, LYue/ۥۣۣۡۧ;

    const/16 v1, 0x10

    invoke-direct {v0, v1, p0}, LYue/ۥۣۣۡۧ;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    iget v1, p0, LYue/ۥۣۣۡۧ;->ۥ۟۟۠ۤ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۣۣۡۧ;->ۥ۟۟۠ۤ:I

    return v0
.end method
