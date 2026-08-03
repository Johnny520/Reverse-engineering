.class public final synthetic Lh0/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lh0/l;

.field public final synthetic h:Z

.field public final synthetic i:Lt2/j;

.field public final synthetic j:Z

.field public final synthetic k:J

.field public final synthetic l:F

.field public final synthetic m:Ly0/o;

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Lh0/l;ZLt2/j;ZJFLy0/o;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh0/b;->g:Lh0/l;

    .line 5
    .line 6
    iput-boolean p2, p0, Lh0/b;->h:Z

    .line 7
    .line 8
    iput-object p3, p0, Lh0/b;->i:Lt2/j;

    .line 9
    .line 10
    iput-boolean p4, p0, Lh0/b;->j:Z

    .line 11
    .line 12
    iput-wide p5, p0, Lh0/b;->k:J

    .line 13
    .line 14
    iput p7, p0, Lh0/b;->l:F

    .line 15
    .line 16
    iput-object p8, p0, Lh0/b;->m:Ly0/o;

    .line 17
    .line 18
    iput p9, p0, Lh0/b;->n:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lh0/b;->n:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, Lh0/b;->g:Lh0/l;

    .line 18
    .line 19
    iget-boolean v1, p0, Lh0/b;->h:Z

    .line 20
    .line 21
    iget-object v2, p0, Lh0/b;->i:Lt2/j;

    .line 22
    .line 23
    iget-boolean v3, p0, Lh0/b;->j:Z

    .line 24
    .line 25
    iget-wide v4, p0, Lh0/b;->k:J

    .line 26
    .line 27
    iget v6, p0, Lh0/b;->l:F

    .line 28
    .line 29
    iget-object v7, p0, Lh0/b;->m:Ly0/o;

    .line 30
    .line 31
    invoke-static/range {v0 .. v9}, Loh/h;->b(Lh0/l;ZLt2/j;ZJFLy0/o;Li0/h0;I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 35
    .line 36
    return-object p1
.end method
