.class public final LU/o;
.super LU/D;
.source "SourceFile"


# instance fields
.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, LU/D;-><init>(II)V

    const/4 p1, -0x1

    iput p1, p0, LU/o;->d:I

    const/4 p1, 0x0

    iput p1, p0, LU/o;->e:I

    return-void
.end method
