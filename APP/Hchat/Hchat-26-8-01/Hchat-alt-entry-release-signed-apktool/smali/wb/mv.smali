.class public final Lwb/mv;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Lfg/l;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lfg/l;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/mv;->g:Lfg/l;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/mv;->h:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lwb/mv;->g:Lfg/l;

    .line 2
    .line 3
    iget-object v1, p0, Lwb/mv;->h:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    return-object v0
.end method
