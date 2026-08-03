.class public La/f8;
.super La/N3;
.source "SourceFile"


# instance fields
.field public e0:[La/N3;

.field public f0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/N3;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [La/N3;

    iput-object v0, p0, La/f8;->e0:[La/N3;

    const/4 v0, 0x0

    iput v0, p0, La/f8;->f0:I

    return-void
.end method


# virtual methods
.method public B()V
    .locals 0

    return-void
.end method
