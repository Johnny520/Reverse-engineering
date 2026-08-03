.class public final Lm/b2;
.super Lyf/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:J

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lfd/h;

.field public j:I


# direct methods
.method public constructor <init>(Lfd/h;Lyf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/b2;->i:Lfd/h;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lyf/c;-><init>(Lwf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iput-object p1, p0, Lm/b2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lm/b2;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lm/b2;->j:I

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    iget-object v0, p0, Lm/b2;->i:Lfd/h;

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, Lfd/h;->m0(JJLyf/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
