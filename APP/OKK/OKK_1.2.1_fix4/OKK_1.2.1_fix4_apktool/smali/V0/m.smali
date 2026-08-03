.class public final LV0/m;
.super LQ0/h;
.source "SourceFile"

# interfaces
.implements LP0/l;


# static fields
.field public static final a:LV0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LV0/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LQ0/h;-><init>(I)V

    sput-object v0, LV0/m;->a:LV0/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
