.class public final synthetic Lw/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lh0/l;

.field public final synthetic h:Ly0/o;

.field public final synthetic i:J


# direct methods
.method public synthetic constructor <init>(Lh0/l;Ly0/o;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/a;->g:Lh0/l;

    .line 5
    .line 6
    iput-object p2, p0, Lw/a;->h:Ly0/o;

    .line 7
    .line 8
    iput-wide p3, p0, Lw/a;->i:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Li0/r;->C(I)I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    iget-object v0, p0, Lw/a;->g:Lh0/l;

    .line 15
    .line 16
    iget-object v1, p0, Lw/a;->h:Ly0/o;

    .line 17
    .line 18
    iget-wide v2, p0, Lw/a;->i:J

    .line 19
    .line 20
    invoke-static/range {v0 .. v5}, Lw/b;->a(Lh0/l;Ly0/o;JLi0/h0;I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 24
    .line 25
    return-object p1
.end method
