.class public final LYue/ۥۡۦۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:I

.field public final ۥ۟:LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟:J


# direct methods
.method public constructor <init>(ILYue/ۥۣ۟ۥۤ;J)V
    .locals 0
    .param p2    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥۡۦۡ$ۥ;->ۥ:I

    iput-object p2, p0, LYue/ۥۡۦۡ$ۥ;->ۥ۟:LYue/ۥۣ۟ۥۤ;

    iput-wide p3, p0, LYue/ۥۡۦۡ$ۥ;->ۥ۟۟:J

    return-void
.end method


# virtual methods
.method public final ۥ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۡۦۡ$ۥ;->ۥ۟۟:J

    return-wide v0
.end method

.method public final ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦۡ$ۥ;->ۥ:I

    return v0
.end method

.method public final ۥ۟۟()LYue/ۥۣ۟ۥۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۡ$ۥ;->ۥ۟:LYue/ۥۣ۟ۥۤ;

    return-object v0
.end method
