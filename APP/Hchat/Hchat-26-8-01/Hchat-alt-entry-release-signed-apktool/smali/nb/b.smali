.class public final synthetic Lnb/b;
.super Lgg/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# static fields
.field public static final n:Lnb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lnb/b;

    .line 2
    .line 3
    const-class v1, Lnb/d;

    .line 4
    .line 5
    invoke-static {v1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v5, 0x0

    .line 10
    sget-object v1, Lgg/c;->g:Lgg/c;

    .line 11
    .line 12
    const-string v3, "packageName"

    .line 13
    .line 14
    const-string v4, "getPackageName()Ljava/lang/String;"

    .line 15
    .line 16
    invoke-direct/range {v0 .. v5}, Lgg/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lnb/b;->n:Lnb/b;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final e()Lmg/a;
    .locals 1

    .line 1
    sget-object v0, Lgg/v;->a:Lgg/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lnb/d;

    .line 2
    .line 3
    iget-object p1, p1, Lnb/d;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p1
.end method
