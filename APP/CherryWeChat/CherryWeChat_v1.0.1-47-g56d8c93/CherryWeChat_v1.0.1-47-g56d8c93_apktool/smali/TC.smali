.class public final LTC;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LTC;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LTC;->a:LTC;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlin.Unit"

    return-object v0
.end method
