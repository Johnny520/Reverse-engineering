.class public final LYue/ۥ۠ۤۨۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۨۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:[LYue/ۥ۠ۤۨۧ$ۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟:I

.field public final ۥ۟۟:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 2
    new-array v0, v0, [LYue/ۥ۠ۤۨۧ$ۥ;

    iput-object v0, p0, LYue/ۥ۠ۤۨۧ$ۥ;->ۥ:[LYue/ۥ۠ۤۨۧ$ۥ;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, LYue/ۥ۠ۤۨۧ$ۥ;->ۥ۟:I

    .line 4
    iput v0, p0, LYue/ۥ۠ۤۨۧ$ۥ;->ۥ۟۟:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, LYue/ۥ۠ۤۨۧ$ۥ;->ۥ:[LYue/ۥ۠ۤۨۧ$ۥ;

    .line 7
    iput p1, p0, LYue/ۥ۠ۤۨۧ$ۥ;->ۥ۟:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 8
    :cond_0
    iput p1, p0, LYue/ۥ۠ۤۨۧ$ۥ;->ۥ۟۟:I

    return-void
.end method


# virtual methods
.method public final ۥ()[LYue/ۥ۠ۤۨۧ$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨۧ$ۥ;->ۥ:[LYue/ۥ۠ۤۨۧ$ۥ;

    return-object v0
.end method

.method public final ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤۨۧ$ۥ;->ۥ۟:I

    return v0
.end method

.method public final ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۤۨۧ$ۥ;->ۥ۟۟:I

    return v0
.end method
