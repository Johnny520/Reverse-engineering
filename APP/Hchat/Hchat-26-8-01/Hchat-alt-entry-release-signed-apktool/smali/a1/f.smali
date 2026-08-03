.class public final La1/f;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# static fields
.field public static final g:La1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La1/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lgg/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La1/f;->g:La1/f;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lf2/q;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf2/q;->k()Lf2/m;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lf2/u;->A:Lf2/x;

    .line 8
    .line 9
    iget-object p1, p1, Lf2/m;->g:Lf/k0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
