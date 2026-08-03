.class public final La/a6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Pd;


# static fields
.field public static final a:La/a6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a6;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/a6;->a:La/a6;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    sget-object v0, La/X5;->a:La/X5;

    return-object v0
.end method
