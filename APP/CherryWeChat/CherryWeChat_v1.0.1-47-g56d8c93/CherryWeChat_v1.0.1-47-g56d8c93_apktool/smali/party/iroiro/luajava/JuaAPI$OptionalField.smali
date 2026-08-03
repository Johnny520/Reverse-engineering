.class final Lparty/iroiro/luajava/JuaAPI$OptionalField;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/JuaAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OptionalField"
.end annotation


# instance fields
.field public final field:Ljava/lang/reflect/Field;


# direct methods
.method private constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lparty/iroiro/luajava/JuaAPI$OptionalField;->field:Ljava/lang/reflect/Field;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Field;Lparty/iroiro/luajava/JuaAPI$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lparty/iroiro/luajava/JuaAPI$OptionalField;-><init>(Ljava/lang/reflect/Field;)V

    return-void
.end method
