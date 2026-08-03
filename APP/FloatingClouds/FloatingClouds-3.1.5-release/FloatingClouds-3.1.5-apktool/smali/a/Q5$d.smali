.class public final La/Q5$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Q5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public a:I

.field public final b:La/kb$a;

.field public c:La/kb$a;

.field public d:La/kb$a;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(La/kb$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, La/Q5$d;->a:I

    iput-object p1, p0, La/Q5$d;->b:La/kb$a;

    iput-object p1, p0, La/Q5$d;->c:La/kb$a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La/Q5$d;->a:I

    iget-object v0, p0, La/Q5$d;->b:La/kb$a;

    iput-object v0, p0, La/Q5$d;->c:La/kb$a;

    const/4 v0, 0x0

    iput v0, p0, La/Q5$d;->f:I

    return-void
.end method

.method public final b()Z
    .locals 4

    iget-object v0, p0, La/Q5$d;->c:La/kb$a;

    iget-object v0, v0, La/kb$a;->b:La/Tf;

    invoke-virtual {v0}, La/Tf;->b()La/ib;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, La/Qe;->a(I)I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v3, v0, La/Qe;->d:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    iget v0, v0, La/Qe;->a:I

    add-int/2addr v1, v0

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    iget v0, p0, La/Q5$d;->e:I

    const v1, 0xfe0f

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
