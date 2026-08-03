.class public final LIi;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LIi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LIi;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, LIi;->a:LIi;

    return-void
.end method
