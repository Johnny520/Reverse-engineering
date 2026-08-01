.class public final synthetic Lnp1;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# static fields
.field public static final ε:Lnp1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lnp1;

    .line 2
    .line 3
    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x3

    .line 7
    const-class v2, Lg40;

    .line 8
    .line 9
    const-string v3, "emit"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lp80;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lnp1;->ε:Lnp1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lg40;

    .line 2
    .line 3
    check-cast p3, Lop;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, Lg40;->δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
