.class public final synthetic LV0/n;
.super LQ0/f;
.source "SourceFile"

# interfaces
.implements LP0/l;


# static fields
.field public static final i:LV0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LV0/n;

    const-string v1, "iterator"

    const-string v2, "iterator()Ljava/util/Iterator;"

    const-class v3, LV0/h;

    invoke-direct {v0, v3, v1, v2}, LQ0/f;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LV0/n;->i:LV0/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, LV0/h;

    const-string v0, "p0"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LV0/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
