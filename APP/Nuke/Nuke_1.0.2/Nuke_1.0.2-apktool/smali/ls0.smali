.class public interface abstract Lls0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ln71;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll71;

    .line 2
    .line 3
    sget-object v0, Ll71;->a:Ljava/util/Map;

    .line 4
    .line 5
    new-instance v1, Ln71;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ln71;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    sput-object v1, Lls0;->a:Ln71;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
