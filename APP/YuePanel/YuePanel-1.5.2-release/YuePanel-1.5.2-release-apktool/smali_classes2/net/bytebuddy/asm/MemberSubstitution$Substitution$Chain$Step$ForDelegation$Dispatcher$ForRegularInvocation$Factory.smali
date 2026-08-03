.class public final enum Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;",
        ">;",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;

.field public static final enum INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;

    filled-new-array {v0}, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;
    .locals 1

    const-class v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;
    .locals 1

    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;

    invoke-virtual {v0}, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory;

    return-object v0
.end method


# virtual methods
.method public make(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher;
    .locals 1

    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation;

    invoke-direct {v0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    return-object v0
.end method
