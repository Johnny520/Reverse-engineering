.class public final synthetic Lxhss/ᲀᲇᛷᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field public final synthetic ᛷᛵᛵᲈ:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲀᲇᛷᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᲀᲇᛷᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const-class v0, Lxhss/ᛱᲇᲁᛱ;

    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
