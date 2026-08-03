.class public final Lk/h;
.super Lyf/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:J

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lk/i;

.field public j:I


# direct methods
.method public constructor <init>(Lk/i;Lyf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/h;->i:Lk/i;

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
    .locals 3

    .line 1
    iput-object p1, p0, Lk/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lk/h;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lk/h;->j:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, Lk/h;->i:Lk/i;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p1, p0}, Lk/i;->a(JLm/n2;Lyf/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
