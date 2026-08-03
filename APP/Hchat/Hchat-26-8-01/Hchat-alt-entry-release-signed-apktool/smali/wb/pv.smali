.class public final Lwb/pv;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# static fields
.field public static final a:Lwb/pv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lwb/pv;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwb/pv;->a:Lwb/pv;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lwb/sr;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwb/sr;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x7

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p1, v2, v0, p2, v1}, Lm/y2;->d(Ls1/x;Lwb/l7;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
