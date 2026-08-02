.class public final Lkp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lxk1;

.field public final synthetic c:Lxk1;


# direct methods
.method public constructor <init>(ZLxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lkp1;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lkp1;->b:Lxk1;

    .line 7
    .line 8
    iput-object p3, p0, Lkp1;->c:Lxk1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ls12;Lt00;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lkp1;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Llm0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x3

    .line 10
    iget-object v3, p0, Lkp1;->b:Lxk1;

    .line 11
    .line 12
    iget-object p0, p0, Lkp1;->c:Lxk1;

    .line 13
    .line 14
    invoke-direct {v0, v3, p0, v1, v2}, Llm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Lzw2;

    .line 18
    .line 19
    invoke-virtual {p1, v0, p2}, Lzw2;->M0(Lmn0;Lt00;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, Lk20;->h:Lk20;

    .line 24
    .line 25
    if-ne p0, p1, :cond_1

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 29
    .line 30
    return-object p0
.end method
