.class public final synthetic Lwb/as;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/y2;

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lwb/y2;JLjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/as;->g:Lwb/y2;

    .line 5
    .line 6
    iput-wide p2, p0, Lwb/as;->h:J

    .line 7
    .line 8
    iput-object p4, p0, Lwb/as;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput p5, p0, Lwb/as;->j:I

    .line 11
    .line 12
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
    iget p1, p0, Lwb/as;->j:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, Lwb/as;->g:Lwb/y2;

    .line 18
    .line 19
    iget-wide v1, p0, Lwb/as;->h:J

    .line 20
    .line 21
    iget-object v3, p0, Lwb/as;->i:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual/range {v0 .. v5}, Lwb/y2;->s0(JLjava/lang/String;Li0/h0;I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    return-object p1
.end method
