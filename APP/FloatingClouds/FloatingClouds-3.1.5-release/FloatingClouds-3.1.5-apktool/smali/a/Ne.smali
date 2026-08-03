.class public final La/Ne;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/Ne$a;
    }
.end annotation


# static fields
.field public static final a:La/Ne;

.field public static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La/Oe;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, La/Ne;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/Ne;->a:La/Ne;

    new-instance v0, La/Vc;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, La/y2;

    invoke-direct {v1}, La/y2;-><init>()V

    new-instance v2, La/sf;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x3

    new-array v3, v3, [La/Oe;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, La/Ne;->b:Ljava/util/List;

    return-void
.end method
