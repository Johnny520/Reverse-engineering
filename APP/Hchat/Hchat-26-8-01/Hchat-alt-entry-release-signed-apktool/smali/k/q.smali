.class public final synthetic Lk/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lf1/s;

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:Lh1/c;


# direct methods
.method public synthetic constructor <init>(Lf1/t0;JJLh1/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/q;->g:Lf1/s;

    .line 5
    .line 6
    iput-wide p2, p0, Lk/q;->h:J

    .line 7
    .line 8
    iput-wide p4, p0, Lk/q;->i:J

    .line 9
    .line 10
    iput-object p6, p0, Lk/q;->j:Lh1/c;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lx1/h0;

    .line 3
    .line 4
    invoke-virtual {v0}, Lx1/h0;->e()V

    .line 5
    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    const/16 v9, 0x68

    .line 9
    .line 10
    iget-object v1, p0, Lk/q;->g:Lf1/s;

    .line 11
    .line 12
    iget-wide v2, p0, Lk/q;->h:J

    .line 13
    .line 14
    iget-wide v4, p0, Lk/q;->i:J

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    iget-object v7, p0, Lk/q;->j:Lh1/c;

    .line 18
    .line 19
    invoke-static/range {v0 .. v9}, Lh1/d;->V0(Lh1/d;Lf1/s;JJFLh1/c;II)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 23
    .line 24
    return-object p1
.end method
