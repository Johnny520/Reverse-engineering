.class public final synthetic Li/w0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lgg/u;

.field public final synthetic h:F

.field public final synthetic i:Li/g;

.field public final synthetic j:Li/l;

.field public final synthetic k:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lgg/u;FLi/g;Li/l;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li/w0;->g:Lgg/u;

    .line 5
    .line 6
    iput p2, p0, Li/w0;->h:F

    .line 7
    .line 8
    iput-object p3, p0, Li/w0;->i:Li/g;

    .line 9
    .line 10
    iput-object p4, p0, Li/w0;->j:Li/l;

    .line 11
    .line 12
    iput-object p5, p0, Li/w0;->k:Lfg/l;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-object p1, p0, Li/w0;->g:Lgg/u;

    .line 8
    .line 9
    iget-object p1, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Li/j;

    .line 16
    .line 17
    iget v3, p0, Li/w0;->h:F

    .line 18
    .line 19
    iget-object v4, p0, Li/w0;->i:Li/g;

    .line 20
    .line 21
    iget-object v5, p0, Li/w0;->j:Li/l;

    .line 22
    .line 23
    iget-object v6, p0, Li/w0;->k:Lfg/l;

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, Li/d;->m(Li/j;JFLi/g;Li/l;Lfg/l;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object p1
.end method
