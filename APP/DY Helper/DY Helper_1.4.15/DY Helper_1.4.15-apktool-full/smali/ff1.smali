.class public final synthetic Lff1;
.super Lwj1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final ζ:Lff1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lff1;

    .line 2
    .line 3
    const-string v1, "id"

    .line 4
    .line 5
    const-string v2, "getId()Ljava/lang/String;"

    .line 6
    .line 7
    const-class v3, Lze1;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lwj1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lff1;->ζ:Lff1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lze1;

    .line 2
    .line 3
    iget-object p0, p1, Lze1;->α:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method
