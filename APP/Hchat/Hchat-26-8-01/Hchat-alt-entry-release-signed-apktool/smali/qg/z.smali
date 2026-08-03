.class public final Lqg/z;
.super Lyf/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public synthetic g:Ljava/lang/Object;

.field public h:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lqg/z;->g:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lqg/z;->h:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lqg/z;->h:I

    .line 9
    .line 10
    invoke-static {p0}, Lqg/v;->b(Lyf/c;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 14
    .line 15
    return-object p1
.end method
