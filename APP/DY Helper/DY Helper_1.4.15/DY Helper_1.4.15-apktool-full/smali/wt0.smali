.class public final Lwt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Z

.field public final synthetic γ:Lg21;

.field public final synthetic δ:Lg21;

.field public final synthetic ε:Lg21;

.field public final synthetic ζ:Lg21;

.field public final synthetic η:Lg21;

.field public final synthetic θ:Lg21;


# direct methods
.method public constructor <init>(IZLg21;Lg21;Lg21;Lg21;Lg21;Lg21;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwt0;->α:I

    .line 5
    .line 6
    iput-boolean p2, p0, Lwt0;->β:Z

    .line 7
    .line 8
    iput-object p3, p0, Lwt0;->γ:Lg21;

    .line 9
    .line 10
    iput-object p4, p0, Lwt0;->δ:Lg21;

    .line 11
    .line 12
    iput-object p5, p0, Lwt0;->ε:Lg21;

    .line 13
    .line 14
    iput-object p6, p0, Lwt0;->ζ:Lg21;

    .line 15
    .line 16
    iput-object p7, p0, Lwt0;->η:Lg21;

    .line 17
    .line 18
    iput-object p8, p0, Lwt0;->θ:Lg21;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Lei1;Lop;)Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v0, 0x4

    .line 2
    int-to-float v0, v0

    .line 3
    check-cast p1, Le22;

    .line 4
    .line 5
    invoke-virtual {p1}, Le22;->β()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-float v3, v1, v0

    .line 10
    .line 11
    new-instance v2, Lvt0;

    .line 12
    .line 13
    iget-object v11, p0, Lwt0;->θ:Lg21;

    .line 14
    .line 15
    const/4 v12, 0x0

    .line 16
    iget v4, p0, Lwt0;->α:I

    .line 17
    .line 18
    iget-boolean v5, p0, Lwt0;->β:Z

    .line 19
    .line 20
    iget-object v6, p0, Lwt0;->γ:Lg21;

    .line 21
    .line 22
    iget-object v7, p0, Lwt0;->δ:Lg21;

    .line 23
    .line 24
    iget-object v8, p0, Lwt0;->ε:Lg21;

    .line 25
    .line 26
    iget-object v9, p0, Lwt0;->ζ:Lg21;

    .line 27
    .line 28
    iget-object v10, p0, Lwt0;->η:Lg21;

    .line 29
    .line 30
    invoke-direct/range {v2 .. v12}, Lvt0;-><init>(FIZLg21;Lg21;Lg21;Lg21;Lg21;Lg21;Lop;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v2, p2}, Lpd2;->θ(Lei1;Le80;Lop;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sget-object p1, Lcq;->ε:Lcq;

    .line 38
    .line 39
    if-ne p0, p1, :cond_0

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 43
    .line 44
    return-object p0
.end method
