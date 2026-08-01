.class public final La51;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:La51;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La51;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La51;->α:La51;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α(La80;La80;Lp70;Lp70;)Landroid/window/OnBackInvokedCallback;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La80;",
            "La80;",
            "Lp70;",
            "Lp70;",
            ")",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p0, Lz41;

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, p3, p4}, Lz41;-><init>(La80;La80;Lp70;Lp70;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method
